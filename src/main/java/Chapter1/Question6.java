package Chapter1;

/**
 * Created by tzeyangng on 13/3/17.
 */
public class Question6 {
    //Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
    // write a method to rotate the image by 90 degrees. Canyou do this in place?

    public static int[][] solve(int[][] matrix){

        int N = matrix.length;
        int temp;
        for (int j=0;j<2;j++) {
            for (int i = j; i < N-1-j; i++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[N-j-1][i];
                matrix[N-j-1][i] = matrix[N - i-1][N-j-1];
                matrix[N - i-1][N-j-1] = matrix[j][N - i-1];
                matrix[j][N - i-1] = temp;
            }
        }

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
