import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (seen.contains(board[i][j])) return false;
                seen.add(board[i][j]);
            }
        }

        

        // Check columns
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (seen.contains(board[j][i])) return false;
                seen.add(board[j][i]);
            }
        }

        // Check 3x3 sub-boxes
        for (int box = 0; box < 9; box++) {
            Set<Character> seen = new HashSet<>();
            int rowStart = (box / 3) * 3;
            int colStart = (box % 3) * 3;

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    char val = board[rowStart + r][colStart + c];
                    if (val == '.') continue;
                    if (seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }

        return true;
    }
}