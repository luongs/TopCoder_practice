/**
** Reverse digits of an integer.
**
** Example1: x = 123, return 321
** Example2: x = -123, return -321
**/

public class Solution {
    public int reverse(int x) {
        int zeroes = countZero(x); 
        boolean neg = checkNeg(x); 
        int num2 = 0; 
        while (x!=0){
            int lowest = x%10; 
            num2 += lowest*(Math.pow(10,zeroes));
            zeroes--; 
            x = x/10;
        }
        return num2;
    }
    
    public int countZero(int x){
        int count=-1;
        while (x!=0){
            x = x/10; 
            count++; 
        }
        return count; 
    }
    
    public boolean checkNeg(int x){
        if (x<0)
            return true;
        return false; 
    }
}