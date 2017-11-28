package term3_34;

public class Ex3_4 {

	public static void wdegree(int w[][], int n) {

		int s[] = new int[n];

		for (int i = 0; i < n; i++) {
			int indegree = 0;
			for (int j = 0; j < n; j++) {
				if (w[i][j] != 1)
					indegree = indegree + w[i][j];
			}
			s[i] = indegree;
		}
		// ------------------------------------
		int m[] = new int[n];
		for (int i = 0; i < n; i++) {
			int outdegree = 0;
			for (int j = 0; j < n; j++) {
				if (w[j][i] != 0)
					outdegree = outdegree + w[j][i];
			}
			m[i] = outdegree;
		}
		// -----------------------------------
		for (int i = 0; i < n; i++) {
			if (s[i] != 0 && m[i] == 0)
				System.out.println("gere " + (i + 1) + " dar geraf vazn dar manba ast");
			else if (s[i] == 0 && m[i] != 0)
				System.out.println("gere " + (i + 1) + " dar geraf vazn dar sink ast");
			else
				System.out.println("gere " + (i + 1) + " no sink , no manba");

		}

	}

	// ***********************************************************************
	public static void hdegree(int a[][], int n) {
		int s[] = new int[n];
		for (int i = 0; i < n; i++) {
			int indegree = 0;
			for (int j = 0; j < n; j++) {
				indegree = indegree + a[i][j];
			}
			s[i] = indegree;
		}
		// -----------------------------------------
		int m[] = new int[n];
		for (int i = 0; i < n; i++) {
			int outdegree = 0;
			for (int j = 0; j < n; j++) {
				outdegree = outdegree + a[j][i];
			}
			m[i] = outdegree;
		}
		// -------------------------------------------
		for (int i = 0; i < n; i++) {
			if (s[i] != 0 && m[i] == 0)
				System.out.println("gere " + (i + 1) + " dar geraf hamjavari manba ast");
			else if (s[i] == 0 && m[i] != 0)
				System.out.println("gere " + (i + 1) + " dar geraf hamjavari sink ast");
			else
				System.out.println("gere " + (i + 1) + " no sink , no manba");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w[][] = { { 0, 1, 0, 4 }, { 0, 0, 2, 0 }, { 0, 0, 0, 3 }, { 0, 0, 0, 0 } };
		wdegree(w, 4);

		System.out.println("\n");

		int h[][] = { { 0, 1, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 } };
		hdegree(h, 4);

	}

}
