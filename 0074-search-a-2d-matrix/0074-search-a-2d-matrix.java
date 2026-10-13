public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // Number of rows = 3
        int n = matrix[0].length; // Number of columns = 4

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;

        // int row = 0;
        // int col = matrix[0].length - 1;

        // while (row <= matrix[0].length - 1 && col >= 0) {
        //     if (matrix[row][col] == target) {
        //         return true;
        //     } else if (target < matrix[row][col]) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }

        // return false;
    }
}
