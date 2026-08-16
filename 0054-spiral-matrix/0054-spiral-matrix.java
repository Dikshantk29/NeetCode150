import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int sr = 0;
        int er = matrix.length - 1;

        int sc = 0;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            //left- right
            for (int col = sc; col <= ec; col++) {
                list.add(matrix[sr][col]);
            }
            sr++;

            //top - bottom
            for (int row = sr; row <= er; row++) {
                list.add(matrix[row][ec]);
            }
            ec--;

            //right - left
            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    list.add(matrix[er][col]);

                }
                er--;
            }
            //bottom -top
            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    list.add(matrix[row][sc]);

                }
                sc++;
            }

        }
        return list;

    }
}
