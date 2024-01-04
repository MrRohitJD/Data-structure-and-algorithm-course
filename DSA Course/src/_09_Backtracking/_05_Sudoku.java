package _09_Backtracking;

public class _05_Sudoku {
    public static boolean isSafe(int sudoku[][], int row,int col, int digit){
//        row
        for(int i=0;i<=8;i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        for(int j=0;j<=8;j++){
            if (sudoku[row][j]==digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for (int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc;j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean sudokusol(int sudoku[][], int row,int col){
//        base case
        if (row==9){
            return true;
        }
//        recursion
        int nextrow = row;
        int nextcol = col+1;
        if (col+1==9){
            nextrow =row+1;
            nextcol = 0;
        }
        if (sudoku[row][col] !=0){
            return sudokusol(sudoku,nextrow,nextcol);
        }
        for (int digit=0;digit<=9;digit++){
            if (isSafe(sudoku, row,col, digit)){
                sudoku[row][col]=digit;
                if (sudokusol(sudoku,nextrow , nextcol)){
                    return true;
                }
                sudoku[row][col]= 0;
            }
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int sudoku [][] =  {
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
        if (sudokusol(sudoku,0,0)){
            System.out.println("Solution exist");
            printsudoku(sudoku);
        }
        else {
            System.out.println("Solution does not exist");
        }
    }
}
