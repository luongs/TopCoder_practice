package ch1;

import java.util.Arrays;
import java.util.HashMap;

public class q1_1 {

	public static boolean isUnique(String str){
		if (str == null)
			return true;
		char[] arr = str.toCharArray();
		HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
		for (int i=0; i<arr.length; i++){ 
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i],true);
			else
				return false;
		}
		return true;
	}
	
	// in place
	public static boolean inPlaceUnique(String str){
		if (str==null)
			return true;
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if (arr[i]==arr[i+1])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abbd";
		String str3 = null; 
		if (inPlaceUnique(str1))
			System.out.println("1 is unique");
		if (inPlaceUnique(str2))
			System.out.println("2 is unique");
		if (inPlaceUnique(str3))
			System.out.println("3 is unique");
			
	}

}
