package meet12.tugas;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MatrixMultiplication2 {
    private static final int THREAD_THRESHOLD = 100;

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        int[][] result = new int[rows1][columns2];

        multiplyQuadrants(0, 0, 0, 0, rows1, columns1, columns2, matrix1, matrix2, result);

        return result;
    }

    private static void multiplyQuadrants(int rowStart1, int colStart1, int rowStart2, int colStart2, int size, int columns1, int columns2, int[][] matrix1, int[][] matrix2, int[][] result) {
        if (size == 1) {
            result[rowStart1][colStart2] += matrix1[rowStart1][colStart1] * matrix2[rowStart2][colStart2];
            return;
        }

        int halfSize = size / 2;

        if (size > THREAD_THRESHOLD) {
            ExecutorService executorService = Executors.newFixedThreadPool(4);

            // Top-left quadrant
            executorService.execute(() ->
                    multiplyQuadrants(rowStart1, colStart1, rowStart2, colStart2, halfSize, columns1, columns2, matrix1, matrix2, result));

            // Top-right quadrant
            executorService.execute(() ->
                    multiplyQuadrants(rowStart1, colStart1 + halfSize, rowStart2 + halfSize, colStart2, halfSize, columns1, columns2, matrix1, matrix2, result));

            // Bottom-left quadrant
            executorService.execute(() ->
                    multiplyQuadrants(rowStart1 + halfSize, colStart1, rowStart2, colStart2 + halfSize, halfSize, columns1, columns2, matrix1, matrix2, result));

            // Bottom-right quadrant
            executorService.execute(() ->
                    multiplyQuadrants(rowStart1 + halfSize, colStart1 + halfSize, rowStart2 + halfSize, colStart2 + halfSize, halfSize, columns1, columns2, matrix1, matrix2, result));

            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            // Perform multiplication sequentially
            multiplyQuadrants(rowStart1, colStart1, rowStart2, colStart2, halfSize, columns1, columns2, matrix1, matrix2, result);
            multiplyQuadrants(rowStart1, colStart1 + halfSize, rowStart2 + halfSize, colStart2, halfSize, columns1, columns2, matrix1, matrix2, result);
            multiplyQuadrants(rowStart1 + halfSize, colStart1, rowStart2, colStart2 + halfSize, halfSize, columns1, columns2, matrix1, matrix2, result);
            multiplyQuadrants(rowStart1 + halfSize, colStart1 + halfSize, rowStart2 + halfSize, colStart2 + halfSize, halfSize, columns1, columns2, matrix1, matrix2, result);
        }
    }
}

class MatrixMultiplicationTest {
    public static void main(String[] args) {
        // Example matrices
        int rows1 = 100;
        int columns1 = 100;
        int rows2 = 100;
        int columns2 = 100;

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        Random random = new Random();

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = random.nextInt(100);
            }
        }

        long startTime = System.currentTimeMillis();
        int[][] result = MatrixMultiplication3.multiply(matrix1, matrix2);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Program selesai dalam " + executionTime + " milidetik.");
//        // Print the result matrix
//        for (int[] row : result) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
    }
}

