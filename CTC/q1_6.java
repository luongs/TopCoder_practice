package ch1;

public class q1_6 {

	public static int[][] idZeroes(int[][] arr){
		boolean[] row= new boolean[arr.length];
		boolean[] column = new boolean[arr[0].length];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				if (arr[i][j]==0){
					// zero detected
					row[i] = true;
					column[j] = true;
				}
			}
		}
		// id zeroed rows
		for (int rowInd=0; rowInd<arr.length; rowInd++){
			if (row[rowInd]){	//zero found
				// set columns within row to zero
				for (int colInd=0; colInd<arr[0].length; colInd++){
					arr[rowInd][colInd] = 0;
				}
			}
		}
		// id zeroed columns
		for (int col=0; col<arr[0].length; col++){
			if (column[col]){
				// set rows within column to zero
				for (int rowInd=0; rowInd<row.length; rowInd++)
					arr[rowInd][col] = 0;
			}
		}
		return arr;
	}
	
	public static void printArr(int[][] arr){
		for (int row=0; row<arr.length; row++){
			for (int col=0; col<arr[0].length; col++){
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {1,0,3}};
		printArr(arr);
		System.out.println("********");
		printArr(idZeroes(arr));
		

	}

}
