package ch17;

import java.util.Iterator;

public class q17_1 {

	public static int[] swapInPlace(int[] arr, int index1, int index2){
		if (arr==null)
			return null;
		if (index1>arr.length-1 || index2>arr.length-1)
			return null;
		arr[index1] = arr[index1] + arr[index2];
		arr[index2] = arr[index1] - arr[index2];
		arr[index1] = arr[index1] - arr[index2];
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int[] swapArr = swapInPlace(arr, 0,4);
		for (int i=0; i<swapArr.length; i++)
			System.out.println(swapArr[i]); 
	}

}
