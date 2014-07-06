## Sum Of Power: 

Problem Statement
    	
>You are given a int[] array. At any moment, you may choose a nonempty contiguous subsequence of array. Whenever you do so, you will gain power equal to the sum of all elements in the chosen subsequence.

>You chose each possible contiguous subsequence exactly once, each time gaining some power. Compute and return the total amount of power you gained.

Constraints
>* array will contain between 1 and 50 elements, inclusive.
* Each element in array will be between 1 and 100, inclusive.

Examples
>0.	   	
{1,2}
Returns: 6
We have the following three contiguous subsequences:
{1} => 1
{2} => 2
{1,2} => 3
Thus, the sum of all possible powers is 1+2+3=6.
1.    	
{1,1,1}
Returns: 10
A 3-element sequence has 6 possible nonempty contiguous subsequences. For the sequence {1,1,1} these are the subsequences: {1}, {1}, {1}, {1,1}, {1,1}, and {1,1,1}. Their sums are 1, 1, 1, 2, 2, and 3. If you choose each of them once, the total power you'll gain is 1+1+1+2+2+3 = 10.
2.     	
{3,14,15,92,65}
Returns: 1323
3.     	
{1,2,3,4,5,6,7,8,9,10}
Returns: 1210




## FixedDiceGameDiv2: 

Problem Statement
    	
>Alice and Bob are playing a game. Alice has an a-sided die. Bob has a b-sided die. (The faces of an n-sided die have numbers 1 through n written on them.)

>The game is simple: Each player rolls their die, and the player who rolls a strictly larger number wins. (It is possible that neither player wins.)

>You are given the ints a and b. The players already rolled their dice. You do not know what numbers they rolled, but you know that Alice won the game. Compute and return the expected value of the number Alice rolled.

Constraints
>*	a and b will each be between 2 and 1000, inclusive.

Examples
>0.    	
2
2
Returns: 2.0
Alice can only win if she rolls a 2 and Bob rolls a 1. Thus, if we know Alice wins, we know she rolled a 2.
1.    	
4
2
Returns: 3.2
2.	    	
3
3
Returns: 2.6666666666666665
3.    	
11
13
Returns: 7.999999999999999