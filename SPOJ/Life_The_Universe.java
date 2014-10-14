package Problems;

import java.util.Scanner;
/**
 * Problem 1
 * @author bao
 *
 */
public class Life_The_Universe {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 while(sc.hasNextLine())
		 {
			 int current = sc.nextInt();
			 if (current==42)
				 break;
			 else
				 System.out.println(current);
		 }
		
	}

}
