package term3_30;

public class Ex1 {

	public static void print(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// ***************************************************
	public static void path(int t[][],int s[][]){
		
	
		for(int i = 0;i<s.length;i++)
			for(int j = 0;j<s.length;j++)
				s[i][j]=t[i][j];
		for(int k = 0;k<t.length;k++)
			for(int i = 0;i<s.length;i++)
		if(s[i][k]==1)
		for(int j = 0;j<s.length;j++){
			
			if(s[k][j]==0 && s[i][j]==0)
			s[i][j]=0;
			
			else if((s[k][j]==0 && s[i][j]==1)||(s[k][j]==1 && s[i][j]==0))
				s[i][j]=1;
			else 
				s[i][j]=1;
			
			
		}
		           
	}

	public static void main(String[] args) {
		// TODO Auto-generated method

		int s[][] = new int[5][5];
		int t[][] = { { 0, 0, 1, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 1 } };
		System.out.println("The path matrix is :");
		path(t, s);
		print(s);
	}

}
