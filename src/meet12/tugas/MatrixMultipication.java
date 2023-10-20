package meet12.tugas;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

class MatrixMultiplicationTask implements Runnable {
    private int row;
    private int col;
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;

    public MatrixMultiplicationTask(int row, int col, int[][] matrix1, int[][] matrix2, int[][] result) {
        this.row = row;
        this.col = col;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < matrix1[row].length; i++) {
            sum += matrix1[row][i] * matrix2[i][col];
        }
        result[row][col] = sum;
    }
}

class MatrixMultiplication {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns2 = matrix2[0].length;

        int[][] result = new int[rows1][columns2];

        ExecutorService executorService = Executors.newFixedThreadPool(rows1 * columns2);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                Runnable task = new MatrixMultiplicationTask(i, j, matrix1, matrix2, result);
                executorService.execute(task);
            }
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan dimensi matriks pertama:");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();

        System.out.println("Masukkan dimensi matriks kedua:");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matriks tidak bisa dikalikan!");
            return;
        }

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        System.out.println("Masukkan elemen matriks pertama:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[rows1][columns2];

        long startTime = 0;
        long endTime = 0;
        long executionTime = 0;

        System.out.println("Apakah anda ingin menggunakan multithreading? (y/n)");
        String menu = scanner.next();
        if (menu.equalsIgnoreCase("y")) {
            startTime = System.currentTimeMillis();

            result = multiply(matrix1, matrix2);

            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;

            System.out.println("Program selesai dalam " + executionTime + " milidetik.");
        } else if (menu.equalsIgnoreCase("n")) {
            startTime = System.currentTimeMillis();
            // Perform matrix multiplication
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Program selesai dalam " + executionTime + " milidetik.");
        } else {
            System.out.println("Masukan salah!");
        }
        // Print the result
        System.out.println("Hasil perkalian:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}

