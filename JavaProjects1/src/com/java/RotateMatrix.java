package com.java;

public class RotateMatrix {
    static void rotateMatrix(int mat[][]) {
        int n = mat.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                int top = mat[first][i];

                // Move left to top
                mat[first][i] = mat[last - offset][first];

                // Move bottom to left
                mat[last - offset][first] = mat[last][last - offset];

                // Move right to bottom
                mat[last][last - offset] = mat[i][last];

                // Move top to right
                mat[i][last] = top;
            }
        }
    }

    static void printMatrix(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Input matrix:");
        printMatrix(mat);

        rotateMatrix(mat);

        System.out.println("\nOutput matrix:");
        printMatrix(mat);
    }
}