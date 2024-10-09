import java.util.Arrays;
/**/
public class Main
{
	public static void main(String[] args) {
	    int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		for(int i=0;i<matrix.length;i++){
		    int len=matrix[i].length-1;
		    int in=0;
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
                /*
                if(matrix[i][in]<matrix[i][j]){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[i][in];
                    matrix[i][in]=temp;
                }
                */
            }
            while(in!=len){
                int t=matrix[i][len];
                matrix[i][len]=matrix[i][in];
                matrix[i][in]=t;
                in++;
                len--;
            }
            /*
            for(int in=i+1;in<matrix.length;in++){
                if(matrix[i][i]>matrix[i][in]){
                    int temp=matrix[i][in];
                    matrix[i][in]=matrix[i][i];
                    matrix[i][i]=temp;
                }
            }*/
        }
        for(int[] k:matrix){
           System.out.print(Arrays.toString(k));
        }/*
        System.out.print("[");
        for(int[] j:matrix){
            System.out.print("[");
            for(int k=j.length-1;k>=0;k--){
                System.out.print(j[k]+",");
            }
            System.out.print("],");
        }
        System.out.print("]");
        */
	}
}
