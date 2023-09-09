class DP_Failed_Minimizing_Path_Sum {
    public int minPathSum(int[][] grid) {
        //Initialize  sum variable to store the final sum & to check with elements in a grid 
        //condition is grid[0][all elemnts]=sum should be greater than traversal elements in
        // a 2d Array.

        //To Solve this problem I should be aware of the vector and it is Dynamic Programming approach will be
        //to pass all hidden test cases.
        //By using this approach we can pass 10 hidden test cases but fail to pass more than 50 or 60 test cases.
        int sum=0,sumF=0,j=0;
        for(int i=0;i<grid.length;i++){
            int count=0;
            if(i==0){
                while(j<grid[i].length){
                    sum+=grid[i][j];
                    System.out.println(sum);
                    j++;
                    sumF=sum;
                    count++;
                }
                j=0;
            }
            else{
                while(j<grid[i].length){
                    if(sumF<grid[i][j]){
                        sum+=grid[i][j];
                        System.out.println(sum);
                        count++;
                    }
                    j++;
                 }
                j=0;  
            }
            if(count==0)
                sum+=grid[i][grid[i].length-1];
                System.out.println("count : "+count);
        }
        return sum;
    }
}
