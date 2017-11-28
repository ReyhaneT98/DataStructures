package term3_31;

public class Ex2 {

	public static void print(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// *******************************************************
	public static int min(int x, int y) {
		if (x < y)
			return x;
		return y;
	}

	// *******************************************************
	public static void path(int w[][], int p[][]) {
		int m = 4;
		int s[][] = new int[m][m];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++)
				p[i][j] = w[i][j];
		for (int k = 0; k < m; k++) {
			for (int i = 0; i < m; i++)
				for (int j = 0; j < m; j++)
					s[i][j] = min(p[i][j], p[i][k] + p[k][j]);
			for (int i = 0; i < m; i++)
				for (int j = 0; j < m; j++)
					p[i][j] = s[i][j];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int p[][] = new int[m][m];
		int w[][] = { { 7, 5, 100, 100 }, { 7, 100, 100, 2 }, { 100, 3, 100, 100 }, { 4, 100, 1, 100 } };

		path(w, p);
		System.out.println("The path matrix is :");
		print(p);

	}

}
