package ch1;

import java.util.HashMap;

public class q1_3 {

	public static boolean isPerm(String str1, String str2){
		if (str1==null||str2==null)
			return false;
		if (str1.length() != str2.length())
			return false;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
		for (int i=0; i<arr1.length; i++){
			hm.put(arr1[i], true);
		}
		for (int i=0; i<arr2.length; i++){
			if (!hm.containsKey(arr2[i]))
					return false; 
		}
		return true; 
	}
	public static void main(String[] args) {
		if (isPerm("","abc"))
			System.out.println("1 is permtation");
		if (isPerm("a","abc"))
			System.out.println("2 is permtation");
		if (isPerm("a","bcd"))
			System.out.println("3 is permtation");
		if (isPerm("ab","ba"))
			System.out.println("4 is permtation");
		if (isPerm("ab","ac"))
			System.out.println("5 is permtation");
	}

}
