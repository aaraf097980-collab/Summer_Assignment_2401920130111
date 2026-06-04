package Week_1.Day_4;

public class DiagonalSum {
    public int diagonalSum(int [][] mat){
        // define sum 
      int  Sum=0;
      int n=mat.length;
        // normal diagonal + reverse diagonal
        for(int i=0;i<n;i++){
            Sum += mat[i][i];
            Sum += mat[i][n-i-1];
        }   
        // if odd length matrix occur 
         if(n%2!=0){
            Sum -= mat[n/2][n/2];
         }
         return Sum;
    }
      public static void main (String [] args ){
        DiagonalSum obj=new DiagonalSum();
        int [][]mat={{1,4,5},{3,4,5},{5,6,7}};
        int result=obj.diagonalSum(mat);
        System.out.println(result);
      }
    }



