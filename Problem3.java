
public class Problem3 {

    public static void main(String[] args) {
        int[][] sudokuBoard = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println(isValidSudoku(sudokuBoard));
    }

    static boolean isValidSudoku(int[][] board) {
        
        for (int row = 0; row < 9; row++) {
            if (!isValidSet(board[row])) {
                return false;
            }
        }

        
        for (int col = 0; col < 9; col++) {
            int[] column = new int[9];
            for (int row = 0; row < 9; row++) {
                column[row] = board[row][col];
            }
            if (!isValidSet(column)) {
                return false;
            }
        }

        
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                int[] subBox = new int[9];
                int index = 0;
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        subBox[index++] = board[row][col];
                    }
                }
                if (!isValidSet(subBox)) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isValidSet(int[] nums) {
        boolean[] seen = new boolean[10];
        for (int num : nums) {
            if (num != 0) {
                if (seen[num]) {
                    return false; 
                }
                seen[num] = true;
            }
        }
        return true;
    }
}
