class The_K_Weakest_Rows_in_a_Matrix_1337 {
  //Without using any comparator and priority queue.
   /*public int[] kWeakestRows(int[][] mat, int k) {
        int len=mat.length;
        int arr[]=new int[len],count=0,res[]=new int[k];
        for(int i=0;i<len;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                    count++;
            }
            arr[i]=count;
            count=0;
        }
        int min=Integer.MAX_VALUE,kLen=0,arr_Len=arr.length,ind=0;
        while(kLen!=k){
            for(int i=0;i<arr_Len;i++){
                if(min>arr[i]){
                    min=arr[i];
                    ind=i;
                }
            }
            arr[ind]=Integer.MAX_VALUE;
            min=Integer.MAX_VALUE;
            res[kLen++]=ind;
        }
        return res;
    }*/
  //This is an optimal solution.
  public static void main(String[] args) {
		int mat[][]= {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}},k = 3;
		System.out.println(Arrays.toString(kWeakestRows(mat, k)));
	}
    public static int[] kWeakestRows(int[][] mat, int k) {
        Comparator<int[]> customComp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if (a[1]==b[1])
                    return b[0]-a[0];
                else
                    return b[1]-a[1];
            }
        };
        int soldier= 0;
        PriorityQueue<int[]> pq = new PriorityQueue(customComp);
        for(int row = 0; row< mat.length; row++){
            for(int col=0; col<mat[0].length; col++){
                if(mat[row][col]==1)
                    soldier++;
            }
            pq.offer(new int[]{row, soldier});
            while(pq.size()>k)
                pq.poll();
            soldier=0;
        }
        int[] result = new int[pq.size()];
        int i = k-1;
        while(!pq.isEmpty()){
            int[] ele=pq.poll();
            result[i--]=ele[0];
        }
        return result;
	}
}
