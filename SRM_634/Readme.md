## MountainRanges:
Problem Statement

> Tom is in charge of a tourist agency. He has a lovely picture of the local mountain range. He would like to sell it to the tourists but first he needs to know how many peaks are visible in the picture.

>The mountain range in the picture can be seen as a sequence of heights. You are given these heights as a int[] height. An element of height is called a peak if its value is strictly greater than each of the values of adjacent elements. Compute and return the number of peaks in the given mountain range.

Constraints
>0.	heights will contain between 1 and 50 elements, inclusive.
1.	Each element of heights will be between 1 and 100, inclusive.

Examples
>0.    	
{5, 6, 2, 4}
Returns: 2
Element 1 (0-based index) is a peak. Its height is 6, which is strictly greater than each of its neighbors' heights (5 and 2). Element 3 is also a peak since its height is 4 and that is strictly greater than its neighbor's height (which is 2).
1.	
    	
{1, 1, 1, 1, 1, 1, 1}
Returns: 0
This is a very flat mountain with no peaks.
2.	
    	
{2, 1}
Returns: 1
Element 0 is a peak.
3.	
    	
{2,5,3,7,2,8,1,3,1}
Returns: 4
The peaks here are the elements with 0-based indices 1, 3, 5, and 7. Their heights are 5, 7, 8, and 3, respectively.
4.	
    	
{1}
Returns: 1
Element 0 is a peak. Even though it has no neighbors, the condition from the problem statement is still satisfied.
5.	
    	
{1,2,3,4,4,3,2,1}
Returns: 0
According to our definition there is no peak in this mountain range.

## ShoppingSurveyDiv2:

Problem Statement

>A store sells M different items, conveniently numbered 0 through M-1. For a shopping survey you interviewed N customers. Each customer responded to the survey with a list of items they've bought. Each customer bought at most one of each item. It is possible that some customers did not buy anything at all.

>After collecting the responses, you've summed up the results and found that s[i] people have bought item i. Due to an unfortunate accident, you've then lost the actual survey responses. All you have left are the values s[i] you computed.

>You are now supposed to report the number of big shoppers among the survey respondents. A big shopper is defined as a customer who has bought all M items. Of course, having lost the detailed responses, you might be unable to determine the actual number of big shoppers.

>You are given the int N and the int[] s with M elements. Compute and return the smallest possible number of big shoppers.

Constraints
>*	N will be between 1 and 100, inclusive.
*	s will contain between 1 and 100 elements, inclusive.
*	Each element in s will be between 0 and N, inclusive.

Examples
>0.    	
5
{3, 3}
Returns: 1
There are 5 customers and 2 items in the store. Each of the items was bought by three of the customers. Since there are five people and a total of six bought items, we must have at least one big shopper. And we can easily verify that there could have been exactly one big shopper and four other customers who have bought one item each.
1.	  	
100
{97}
Returns: 97
2.	  	
10
{9, 9, 9, 9, 9}
Returns: 5
3.    	
7
{1, 2, 3}
Returns: 0
4.	  	
5
{3, 3, 3}
Returns: 0
