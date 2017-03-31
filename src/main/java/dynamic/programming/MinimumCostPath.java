package dynamic.programming;

import static java.lang.Integer.MAX_VALUE;

/**
 * Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of minimum cost
 * path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. Total
 * cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination).
 * You can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j),
 * cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. You may assume that all costs are positive integers.
 */
public class MinimumCostPath {

    public int findCost(int[][] array, int m, int n) {

        if (m < 0 || n < 0) {
            return MAX_VALUE;
        }

        if (m == 0 && n == 0) {
            return array[0][0];
        }

        int first = findCost(array, m - 1, n);
        int second = findCost(array, m - 1, n - 1);
        int third = findCost(array, m, n - 1);
        return array[m][n] + getMin(first, second, third);
    }

    int findCostDynamicProgramming(int[][] array, int m, int n) {
        int i, j;

        // Instead of following line, we can use int totalCost[m+1][n+1] or
        // dynamically allocate memoery to save space. The following line is
        // used to keep te program simple and make it working on all compilers.
        int totalCost[][] = new int[array.length][array[0].length];

        totalCost[0][0] = array[0][0];

     /* Initialize first column of total cost(totalCost) array */
        for (i = 1; i <= m; i++)
            totalCost[i][0] = totalCost[i - 1][0] + array[i][0];

     /* Initialize first row of totalCost array */
        for (j = 1; j <= n; j++)
            totalCost[0][j] = totalCost[0][j - 1] + array[0][j];

     /* Construct rest of the totalCost array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                totalCost[i][j] = array[i][j] + getMin(
                        totalCost[i - 1][j - 1],
                        totalCost[i - 1][j],
                        totalCost[i][j - 1]);

        return totalCost[m][n];
    }

    private int getMin(int... values) {
        int min = MAX_VALUE;
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
