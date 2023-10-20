package meet12.tugas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.lang.Thread;


public class MatrixGeneratorUtil {

    public static int[][] generateMatrix(int rows, int columns) {

        // output array to store the matrix values
        int[][] result = new int[rows][columns];

        // TO generate a random integer.
        Random random = new Random();

        // adding values at each index.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                result[i][j] = random.nextInt(100) * 10;

            }
        }

        // returning output.
        return result;
    }

    // to print the matrix
    public static void print(int[][] matrix) {

        System.out.println();

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

}

class MatrixMultiplication3 {

    public static void main(String[] args) {

        Date start = new Date();

        int[][] m1 = MatrixGeneratorUtil.generateMatrix(200, 200);
        int[][] m2 = MatrixGeneratorUtil.generateMatrix(200, 200);

        int[][] result = multiply(m1, m2);

//        System.out.println("Matrix 1 : ");
//        MatrixGeneratorUtil.print(m1);
//
//        System.out.println("\nMatrix 2 : ");
//        MatrixGeneratorUtil.print(m2);
//
//        System.out.println("\nOutput Matrix : ");
//        MatrixGeneratorUtil.print(result);

        Date end = new Date();
        System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));

    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int resultRows = matrix1.length;
        int resultColumns = matrix2[0].length;

        int[][] result = new int[resultRows][resultColumns];

        int columns2 = matrix2[0].length;

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < resultColumns; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;

    }
}

class RowMultiplyWorker implements Runnable {

    private final int[][] result;
    private int[][] matrix1;
    private int[][] matrix2;
    private final int row;

    public RowMultiplyWorker(int[][] result, int[][] matrix1, int[][] matrix2, int row) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = row;
    }

    @Override
    public void run() {

        for (int i = 0; i < matrix2[0].length; i++) {
            result[row][i] = 0;
            for (int j = 0; j < matrix1[row].length; j++) {
                result[row][i] += matrix1[row][j] * matrix2[j][i];

            }

        }

    }

}

class ParallelThreadsCreator {

    // creating 10 threads and waiting for them to complete then again repeat steps.
    public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
        List threads = new ArrayList<>();
        int rows1 = matrix1.length;
        for (int i = 0; i < rows1; i++) {
            RowMultiplyWorker task = new RowMultiplyWorker(result, matrix1, matrix2, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            if (threads.size() % 10 == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}

/**
 * Normal way to do matrix multiplication.
 *
 * @author JavaProgramTo.com
 *
 */
class MatrixMultiplicationParallel {

    public static void main(String[] args) {

        Date start = new Date();

        int[][] m1 = MatrixGeneratorUtil.generateMatrix(200, 200);
        int[][] m2 = MatrixGeneratorUtil.generateMatrix(200, 200);

        int[][] result = new int[m1.length][m2[0].length];
        ParallelThreadsCreator.multiply(m1, m2, result);

        Date end = new Date();
        System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));

    }

}