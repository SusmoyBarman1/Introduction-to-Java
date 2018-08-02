
package basicjava;

import java.util.Scanner;

public class SumOfVarious {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                    sum += arr[i][j];
            }
        }
        System.out.println("The sum of all diagonal elements: "+sum);
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>i)
                    sum += arr[i][j];
            }
        }
        System.out.println("The sum of upper triangular matrix: "+sum);
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<i)
                    sum += arr[i][j];
            }
        }
        System.out.println("The sum of lower triangular matrix: "+sum);
    }
}
