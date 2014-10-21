public class binarySearch {

	public static boolean binSearch(int[] arr, int value,  int left, int right){
		if (arr==null)
			return false;
		if (right<left)
			return false; 
		int range = right - left;
		int center = range/2;
		if(arr[center] == value)
			return true; 
		else if (arr[center]>value){
			return binSearch(arr,value, left, center-1);
		}
		else if (arr[center]<value){
			return binSearch(arr,value, center+1, right);
		}
		return false; 
	}
	
	public static boolean binSearchIterative(int[] arr, int value){
		if (arr == null)
			return false;
		int left = 0;
		int right = arr.length-1;
		while (right>=left){
			int center = (right-left)/2;
			if (arr[center] == value)
				return true; 
			else if (arr[center]>value){
				right = center-1;
			}
			else if (arr[center]<value){
				left = center+1;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		if (binSearch(arr,0,0,arr.length))
			System.out.println("0 Present");
		if (binSearch(arr,1,0,arr.length))
			System.out.println("1 Present");
		if (binSearchIterative(arr,0))
			System.out.println("0 Present iterative");
		if (binSearchIterative(arr,1))
			System.out.println("1 Present iterative");
	}

}
