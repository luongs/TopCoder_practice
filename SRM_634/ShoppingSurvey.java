package srm634;

public class ShoppingSurvey {
	
	public static int minValue(int N, int[] s){
		int overlap = 0; 
		for (int i=0; i<s.length; i++){
			overlap += N-s[i];
		}
		if (N-overlap<=0)
			return 0;
		return N-overlap; 
	}
	
	public static void main(String[] args) {
		int[] a = {3,3};
		int[] b = {97};
		int[] c = {9,9,9,9,9};
		int[] d = {1,2,3};
		System.out.println(minValue(5,a));
		System.out.println(minValue(100,b));
		System.out.println(minValue(10,c));
		System.out.println(minValue(7,d));
		
	}

}
