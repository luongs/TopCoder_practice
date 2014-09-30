/**
* Given an array of integers, every element appears twice except for one. 
* Find that single one.
* 
*/
// Solution is implemented without extra memory
import java.util.Arrays; 
public class Solution {
    public int singleNumber(int[] A) {
        Arrays.sort(A);
        int soln = 0;
        if (A.length==1)
            soln = A[0];
        else{
            for (int i=0; i<A.length; i++){
                if (i==0){
                    if (A[i]!=A[i+1])
                        soln = A[i]; 
                }
                else if (i==A.length-1){
                    if (A[i-1]!=A[i])
                        soln = A[i];
                }
                else if (A[i-1]!=A[i] && A[i+1]!=A[i])
                    soln = A[i];
            }
        }
        return soln; 
    }
}