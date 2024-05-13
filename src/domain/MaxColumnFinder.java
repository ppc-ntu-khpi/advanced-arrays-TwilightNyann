package domain;

/**
 * Клас для обчислення стовпця з максимальною сумою елементів у матриці.
 */
public class MaxColumnFinder {
    /**
     * Знаходить індекс стовпця матриці з максимальною сумою елементів.
     *
     * @param matrix квадратна матриця з цілими числами
     * @return індекс стовпця з максимальною сумою елементів
     * @throws IllegalArgumentException якщо матриця порожня або нульова
     */
    public static int findMaxColumn(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix is empty or null");
        }

        int maxSum = Integer.MIN_VALUE;
        int maxColumnIndex = -1;

        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxColumnIndex = col;
            }
        }

        return maxColumnIndex;
    }
}
