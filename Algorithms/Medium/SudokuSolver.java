// https://leetcode.com/problems/sudoku-solver/
// Agniva
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        solve(board, 0,0);
    }

    public static void solve(int[][] board, int row, int col){
        if(row == board.length){
            display(board);
            return;
        }
        int nRow = 0;
        int nCol = 0;
        if(col == board[0].length-1){
            nRow = row + 1;
            nCol = 0;
        }else{
            nRow = row;
            nCol = col + 1;
        }

        if(board[row][col] != 0){
            solve(board, nRow, nCol);
        }else {
            for (int po = 1; po <= 9; po++) {
                if(isValid(board, row, col, po)){
                    board[row][col] = po;
                    solve(board, nRow, nCol);
                    board[row][col] = 0;
                }
            }
        }

    }

    public static boolean isValid(int[][] board, int row, int col, int num){
        for (int i = 0; i < board[0].length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == num){
                return false;
            }
        }
        int rowStart = row/3 * 3;
        int colStart = col/3 * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[rowStart+i][colStart+j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
