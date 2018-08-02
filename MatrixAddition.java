
package basicjava;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] Matrix1 = new int[n][n];
        int[][] Matrix2 = new int[n][n];
        
        System.out.println("Enter the values of 1st matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the values of 2nd matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Matrix2[i][j] = input.nextInt();
            }
        }
        int[][] Add = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Add[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        System.out.println("Printing the resulting value: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(Add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
