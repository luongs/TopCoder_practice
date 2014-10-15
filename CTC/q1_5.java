package ch1;

public class q1_5 {

	public static String compress(String str){
		if (str == null)
			return "-1";
		if (str.length()==1)
			return str; 
		char current = '0';
		int count = 1;
		StringBuffer newStr = new StringBuffer();
		char[] original = str.toCharArray();
		for (int i=0; i<original.length-1; i++){
			if (original[i]==original[i+1]){
				count++;
				current = original[i];
			}
			else{
				newStr.append(current);
				newStr.append(count);
				current = original[i+1];
				count = 1; 
			}
		}
		newStr.append(current); 
		newStr.append(count);
		String res = newStr.toString();
		if (res.length()>= str.length())
			return str;
		return res;
	}
	
	public static void main(String[] args) {

		String str1 = "aabcccaaa";
		String str2 = "aab";
		System.out.println(compress(str1));
		System.out.println(compress(str2));
	}

}
