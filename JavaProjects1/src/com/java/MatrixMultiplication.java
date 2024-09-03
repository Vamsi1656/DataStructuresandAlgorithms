package com.java;

import java.util.Random;

public class MatrixMultiplication {

    public static void main(String[] args) {
       
        int rowsA = 250;
        int colsB = 250;

       
        int[][] A = generateRandomMatrix(rowsA, colsB);
        int[][] B = generateRandomMatrix(rowsA, colsB);

        
        if (rowsA != colsB) {
            System.out.println("Matrix dimensions are not valid for multiplication.");
            return;
        }

        
        long startNaive = System.currentTimeMillis();
        int[][] naiveResult = multiplyNaive(A, B);
        long endNaive = System.currentTimeMillis();
        System.out.println("Naive time: " + (endNaive - startNaive) / 1000.0 + "s");

       
        long startStrassen = System.currentTimeMillis();
        int[][] strassenResult = multiplyStrassen(A, B);
        long endStrassen = System.currentTimeMillis();
        System.out.println("Strassen's time: " + (endStrassen - startStrassen) / 1000.0 + "s");

       
    }

   
    private static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100); // Adjust range as needed
            }
        }

        return matrix;
    }

 
    private static int[][] multiplyNaive(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

   
    private static int[][] multiplyStrassen(int[][] A, int[][] B) {
    
        return multiplyNaive(A, B);
    }
}


