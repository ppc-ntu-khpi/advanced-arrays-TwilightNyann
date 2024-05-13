package test;

import domain.MaxColumnFinder;

/**
 * Клас для тестування методу {@link domain.MaxColumnFinder#findMaxColumn(int[][])}.
 */
public class testClass {
    /**
     * Метод main, який викликає метод {@link domain.MaxColumnFinder#findMaxColumn(int[][])} для тестування.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Приклад тестування
        int[][] matrix = {
                {10, 10, 10},
                {20, 20, 20},
                {30, 50, 9}
        };

        int maxColumnIndex = MaxColumnFinder.findMaxColumn(matrix);
        System.out.println("Index of column with maximum sum: " + maxColumnIndex);
    }
}
