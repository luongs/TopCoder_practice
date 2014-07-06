/* Problem SRM 626 Round 1 - Div II Lvl 1
 * Choose all non-empty subsequences of array 
 * Input: int[]
 * Output: int
 */
public class SumOfPower {

	static int findSum(int[] array){
		int sumOfPower = 0;
		for (int i=0; i<array.length; i++){
			int prevTerm = array[i]; 
			for (int j=i; j<array.length; j++){
				if (i == j){
					sumOfPower+=array[j];
				}
				else{
					prevTerm+=array[j];
					sumOfPower+=prevTerm;
				}
			}
		}
		return sumOfPower; 
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(findSum(arr));
	}

}
