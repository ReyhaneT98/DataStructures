package term3_33;

public class Ex5 {

	public static void degree ( int w[][], int n){	
		
		int s[] = new int[n];
		for ( int i =0; i <  n; i++){	
			int indegree = 0;
			for ( int j =0; j < n; j++){	
				if ( w[i][j] != 1)
					indegree = indegree + w[i][j]; 
			}
			s[i]= indegree;
		}
		//------------------------------------
		int m[] = new int[n];
		for ( int i =0; i <  n; i++){	
			int outdegree = 0;
			for ( int j =0; j < n; j++){	
				if ( w[j][i] != 0)
					outdegree = outdegree + w[j][i]; 
			}
			m[i]= outdegree;
		}
		//------------------------------------
		for ( int i = 0; i <  n; i++){
			int x = s[i]-m[i];
			System.out.println("The pure grade " +(i+1)+" is : "+x);
		}
	
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int w[][] = { { 0, 5, 0, 0 }, { 0, 0, 0, 12 }, { 0, 3, 0, 0 }, { 4, 0, 2, 0 } };
		degree(w, 4);

	}

}
