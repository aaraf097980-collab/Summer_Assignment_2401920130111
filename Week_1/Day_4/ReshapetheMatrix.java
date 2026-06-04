package Week_1.Day_4;

public class ReshapetheMatrix {
     public int[][] matrixReshape(int[][] mat, int r, int c) {
            // condition if reshape is possible 
        if (mat.length*mat[0].length!=r*c) { 
            return mat;
        }       
       
        int [][] result= new int [r][c];
        int row=0;int col=0;
             // 
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                result[row][col]=mat[i][j];
                col++;
            if (col == c){
                
                col=0;
                row++;
            }
        }
    }
     return result;
}
     public static void main (String [] args ){
        ReshapetheMatrix obj=new ReshapetheMatrix();
        int [][]mat={{1,2,3},{6,7,8}};
        int r=3;int c=2;
        int [][] result=obj.matrixReshape(mat,r,c);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
     }
}
