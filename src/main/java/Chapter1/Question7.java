package Chapter1;

import java.util.ArrayList;

/**
 * Created by tzeyangng on 14/3/17.
 */
public class Question7 {
    //Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

    public static int[][] solve(int[][] matrix){
        int y = matrix.length;
        int x = matrix[0].length;

        ArrayList<Integer> zeroX = new ArrayList();
        ArrayList<Integer> zeroY = new ArrayList();

        for (int i=0;i<y;i++){
            for (int j=0;j<x;j++){
                if (matrix[i][j] == 0){
                    zeroX.add(j);
                    zeroY.add(i);
                }
            }
        }

        int temp = zeroY.size();

        for(int i=0;i<temp;i++){
            int remove = zeroY.remove(0);
            for(int j=0;j<matrix[remove].length;j++){
                matrix[remove][j] = 0;
            }
        }

        temp = zeroX.size();
        for(int i=0;i<temp;i++){
            int remove = zeroX.remove(0);
            for(int[] j:matrix){
                j[remove] = 0;
            }
        }
        //printMatrix(matrix);
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int N = matrix.length;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
