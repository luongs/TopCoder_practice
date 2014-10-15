package ch1;

public class q1_4 {

	public static String spaceCut(String str, int strLen){
		if (str==null)
			return "Error";
		int start = strLen-1;
		int current = start; 
		int end = str.length()-1;
		char[] arr = str.toCharArray();
		while (current>0){
			if (arr[current] == ' '){
				arr[current] = '%';
				arr[current+1] ='2';
				arr[current+2] = '0';
				--current;
			}
			else{
				arr[end] = arr[current];
				end--;
				--current;
			}
				
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		String test = "Mr John Smith    ";
		System.out.println(spaceCut(test,13));

	}

}
