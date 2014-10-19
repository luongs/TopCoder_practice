package ch17;

public class q17_2 {

	public static boolean checkTicTacToe(char[][] arr){
		int count = 0;
		// Check rows
		for (int i=0; i<arr.length; i++){
			for (int j=1; j<arr[0].length; j++){
				if (arr[i][0]!=arr[i][j]){
					count = 0;
					break;
				}
				count++;
				if (count == 3)
					return true;
			}
		}
		count = 0;
		// Check columns 
		for (int i=0; i<arr.length; i++){
			for (int j=1; j<arr[0].length; j++)
				if (arr[i][0]!=arr[i][j]){
					count = 0;
					break;
				}
			count++; 
			if (count == 3)
				return true; 
		}
		count = 0;
		int count2 = 0; 
		// Check diagonals
		for (int i=0; i<arr.length; i++){
			if (arr[i][i]!=arr[0][0])
				count = 0;
			else 
				count2++;
			if (arr[i][i]!=arr[arr.length-1][0])
				count2 = 0;
			else count = 0;
			
			if (count == 3 || count2 == 3)
				return true; 
		}
			
		return false; 
	}
	public static void main(String[] args) {
		char[][] ticTacToe = {{'x','o','x'},{'o','x','o'},{'x','o','x'} };
		if (checkTicTacToe(ticTacToe))
			System.out.println("winning config");

	}

}
