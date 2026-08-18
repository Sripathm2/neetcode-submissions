class Solution {
    


    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;

        // check rows
        for(int i=0;i<board.length;i++){
            int count[] = new int[9];
            int count_col[] = new int[9];
            
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    count[board[i][j]-'1'] += 1;
                    if(count[board[i][j]-'1'] > 1){
                        return false;
                    }
                }
                if(board[j][i]!='.'){
                    count_col[board[j][i]-'1'] += 1;
                    if(count_col[board[j][i]-'1'] > 1){
                        return false;
                    }
                }

                int count_cell[] = new int[9];
            int tempi = (i/3)*3;
            int tempj = (j/3)*3;
            System.out.println(tempi + "  " + tempj);

            if(board[tempi][tempj] != '.'){
                count_cell[board[tempi][tempj]-'1'] += 1;
            }
            if(board[tempi][tempj+1] != '.'){
                count_cell[board[tempi][tempj+1]-'1'] += 1;
            }
            if(board[tempi][tempj+2] != '.'){
                count_cell[board[tempi][tempj+2]-'1'] += 1;
            }
            if(board[tempi+1][tempj] != '.'){
                count_cell[board[tempi+1][tempj]-'1'] += 1;
            }
            if(board[tempi+2][tempj] != '.'){
                count_cell[board[tempi+2][tempj]-'1'] += 1;
            }
            if(board[tempi+1][tempj+1] != '.'){
                count_cell[board[tempi+1][tempj+1]-'1'] += 1;
            }
            if(board[tempi+1][tempj+2] != '.'){
                count_cell[board[tempi+1][tempj+2]-'1'] += 1;
            }
            if(board[tempi+2][tempj+1] != '.'){
                count_cell[board[tempi+2][tempj+1]-'1'] += 1;
            }
            if(board[tempi+2][tempj+2] != '.'){
                count_cell[board[tempi+2][tempj+2]-'1'] += 1;
            }

            for(int k=0;k<count_cell.length;k++){
                if(count_cell[k]>1){
                    return false;
                }
            }



            }

            
            

        }

        return valid;
    }
}
