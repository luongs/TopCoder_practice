/**
 * SRM 626 Round 1 - Div2 Lvl2
 * 
 *  Input: int, int
 *  Output: double 
 * @author Sebastien Luong
 *
 */
public class FixedDiceGame {
	
	public static double getExpectation(int a, int b){
		double res=0.0;
		double sumFaceA = 0.0; 
		double winCount = 0.0;
		
		for (int faceA=1; faceA<=a; faceA++){
			for (int faceB = 1; faceB<=b ; faceB++){
				if (faceA > faceB){
					sumFaceA+=faceA;
					winCount++;
				}
				else 
					break;
			}
		}
		System.out.println(sumFaceA);
		System.out.println(winCount);
		res = sumFaceA/winCount;
		return res; 
	}
	public static void main(String[] args) {
		System.out.println(getExpectation(11,13));
		
	}

}
