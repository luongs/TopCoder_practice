package Problems;

import java.util.Scanner;

/**
 * Problem 2
 * @author bao
 *
 */
public class Add_reverse {
	
	public static int getMaxLength(String num1, String num2){
		int maxNumLength = 0;
		if (num1.length()>num2.length())
			maxNumLength = num1.length();
		else 
			maxNumLength = num2.length();
		return maxNumLength;
	}
	
	public static int trimZeroes(int num){
		int res = num;
		while (res%10 == 0){
			res = res/10;
		}
		return res;
	}
	
	public static int reverseNum(int num, int size){
		int rev = 0;
		for (int i=size-1; i>=0; i--){
			rev += (int) (num%10*(Math.pow(10,i)));
			num/=10;
		}
		return rev;
	}
	
	public static int getRevSum(int num1, int num2, int maxLength){
		int rev1 = 0;
		int rev2 = 0;
		int revSum;
		rev1 = reverseNum(num1, maxLength);
		rev2 = reverseNum(num2, maxLength);
		rev1 = trimZeroes(rev1);
		rev2 = trimZeroes(rev2);
		revSum = rev1 + rev2;
		return revSum;
	}
	
	public static void main(String[] args) {
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Add numbers separated by space:");
			
			String [] line; 
			int maxNumLength;
			int rev1; 
			int rev2; 
			int revSum;
			// Skip first line
			in.nextLine();
			while (in.hasNextLine()){
				line = in.nextLine().split("\\s+");
				maxNumLength = getMaxLength(line[0], line[1]);
				rev1 = Integer.parseInt(line[0]);
				rev2 = Integer.parseInt(line[1]);
				revSum = getRevSum(rev1, rev2, maxNumLength);
				revSum = trimZeroes(revSum);
				int revSumLength = getMaxLength(Integer.toString(revSum), Integer.toString(revSum));
				revSum =reverseNum(revSum, revSumLength);				
				System.out.println(revSum);
			}
		}
		catch (Exception e){
			e.printStackTrace();
			return;
		}
	}

}
