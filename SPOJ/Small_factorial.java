package Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Small_factorial {

	public static BigInteger factorial(int num){
		BigInteger b = BigInteger.valueOf(num);
		BigInteger one = BigInteger.valueOf(1);
		if (num == 0 || num == 1){
			//b = b.add(BigInteger.valueOf(1));
			return one; 
		}
		else 
			
			return b.multiply(factorial(num-1));
	}
	
	public static void main(String[] args) {
		try{
			Scanner in = new Scanner(System.in);
			BigInteger b = BigInteger.valueOf(0); 
			// Skip first line
			in.nextLine();
			while (in.hasNextLine()){
				//b = b.add(BigInteger.valueOf((factorial(in.nextInt()))));
				System.out.println(factorial(in.nextInt()));
			}
		}
		catch (Exception e){
			e.printStackTrace();
			return;
		}

	}

}
