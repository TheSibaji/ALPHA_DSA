package Two_D_Arrays;

import java.util.Scanner;

public class initializing {

    public static void searchKey(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) { // Fixed the loop condition
            for (int j = 0; j < m; j++) { // Fixed the loop condition
                if (arr[i][j] == key) {
                    System.out.println("The " + key + " is present at: " + i + "," + j);
                }
            }
        }
    }

    public static void main(String[] args) {

        // initializing 2D array
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // taking input from user
        System.out.println("Enter the elements of the " + n + "*" + m + " matrix: ");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Close the Scanner after using it
        // sc.close();

        // search for key
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        // Close the Scanner after using it
        sc.close();

        // output
        System.out.println("The matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // calling the searchKey function
        searchKey(matrix, key);
    }
}
