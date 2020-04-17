package matrx;

public class SurroundedRegions {

	public static void main(String[] args) {

		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' }, };

		new SurroundedRegions().solve(board);
		
	}

	public void solve(char[][] board) {

		int m = board.length;
		int n = board[0].length;

		// first and last column
		for (int i = 0; i < m; i++) {
			if (board[i][0] == 'O') {
				dfs(board, i, 0);
			}
			if (board[i][n - 1] == 'O') {
				dfs(board, i, n - 1);
			}
		}

		// first and last row
		for (int j = 0; j < n; j++) {
			if (board[0][j] == 'O') {
				dfs(board, 0, j);
			}
			if (board[m - 1][j] == 'O') {
				dfs(board, m - 1, j);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 'O')
					board[i][j] = 'X';
				else if (board[i][j] == '*')
					board[i][j] = 'O';
			}
		}
	}

	public void dfs(char[][] board, int i, int j) {
		if (i > board.length - 1 || i < 0 || j < 0 || j > board[0].length)
			return;

		if (board[i][j] == 'O')
			board[i][j] = '*';

		if (i > 0 && board[i - 1][j] == 'O') {
			dfs(board, i - 1, j);
		}
		
		if(i<board.length-1 && board[i+1][j]=='O')
		{
			dfs(board, i + 1, j);
		}
		
		if(j>0 && board[i][j-1]=='O')
		{
			dfs(board, i, j - 1);
		}
		
		
		if(j<board[0].length-1 && board[i][j+1]=='O')
		{
		dfs(board, i, j + 1);
		}
		
		return;

	}

}
