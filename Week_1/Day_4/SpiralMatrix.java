 
 package Week_1.Day_4;
  
 import java.util.ArrayList;
 
 public class SpiralMatrix{
   
         public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result=new ArrayList<>();
            // define boundaries
          int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;
           
        while (topRow <= bottomRow && leftCol <= rightCol) {

            //  move left to right 
            for (int i = leftCol; i <= rightCol; i++) {
                result.add(matrix[topRow][i]);
            }
            topRow++;

            // move top to  bottom
            for (int i = topRow; i <= bottomRow; i++) {
                result.add(matrix[i][rightCol]);
            }
            rightCol--;

            // right to left
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    result.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            // bottom to top
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }

    
       public static void main (String[] args){
    SprialMatrix obj=new SpiralMatrix();
    int [][]matrix={{1,2,3},{56,6,7},{8,1,9}};
        List<Integer>result=obj.spiralOrder(matrix);
        System.out.println(result);
       }
    }
 