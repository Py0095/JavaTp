import java.util.Scanner;
import java.lang.Math;

public class Exo2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please input the matrix dimentions: ");
        n = keyboard.nextInt();
        // int rows = n, cols = n;
        int[][] matrix = new int[n][n];

        if (n <= 2 || n >= 5) {
            while (n <= 2 || n >= 5) {
                System.out.println("Please input a value between[2,5].");
                n = keyboard.nextInt();
                matrix = new int[n][n];
            }

        }

        System.out.println("Please input th value of the matrix \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[>]Input the Value :");
                matrix[i][j] = keyboard.nextInt();
            }
        }
        keyboard.close();
        // #1
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        System.out.format("%-10d", matrix[i][j]);
        }
        System.out.println();
        }

        // //
        System.out.println("------------------------------------------------------------------");
        // // #2
        double somme = 0;

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        if (n == 4) {
        // System.out.println("DEBUG 4");
        if (i == 3 && j == 0) {
        somme += matrix[i][j];
        ;
        ;
        }
        if (i == 2 && j == 1) {
        somme += matrix[i][j];
        ;
        ;
        }
        if (i == 1 && j == 2) {
        somme += matrix[i][j];
        ;
        ;
        }
        if (i == 0 && j == 3) {
        somme += matrix[i][j];
        ;
        ;
        }

        } else {
        // System.out.println("DEBUG 3");

        if (i == 2 && j == 0) {
        somme += matrix[i][j];
        ;
        }
        if (i == 1 && j == 1) {
        somme += matrix[i][j];
        ;
        ;
        }
        if (i == 0 && j == 2) {
        somme += matrix[i][j];
        ;
        ;
        }
        }
        }
        System.out.println();
        }
        double result = (1 / somme) * 3;
        System.out.println("The sum of the element lying on the secondary dioagonald:" + result);

        // #3
        int temp = 0;
        int lindex = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][lindex];
                    matrix[i][lindex] = temp;
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.printf("%d\t", matrix[i][k]);
            }
            System.out.println();

            lindex--;
        }
        // #4
        // int t=0;
        double carre;
        int[] tab1 = new int [n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               carre = Math.pow(matrix[i][j],2);
                if (carre%2==0 && carre%4==0) {
                    for(int k=0;k<tab1.length;k++){
                        tab1[k]=matrix[i][j];
                    }
                }
            }
        }

        for(int k=0;k<tab1.length;k++){
                    System.out.println("the table /4 && /2                                          "+tab1[k]);
                    }
    }
}
