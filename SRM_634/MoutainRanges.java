package srm634;

public class MoutainRanges {

	public static int countPeaks(int[] heights ){
		int peaks = 0;
		if (heights.length == 0)
			return peaks = 0;
		else if (heights.length == 1 && heights[0]>0)
			return peaks = 1; 
		else{
			for (int i=0; i<heights.length; i++){
				if (i==0){
					if (heights[i+1]<heights[i])
						peaks++;
				}
				else if (i==heights.length-1){
					if (heights[i-1]<heights[i])
						peaks++;
				}
				else if (heights[i-1]<heights[i] && heights[i+1]<heights[i])
					peaks++;
				}
				return peaks; 
			}
		}
	
	public static void main(String[] args) {
		int [] a = {1,1,1,1};
		int [] b = {2,1};
		int [] c = {1};
		int [] d = {1,2,3,4,4,3,2,1};
		int [] e = {5,6,2,4};
		System.out.println(countPeaks(a));
		System.out.println(countPeaks(b));
		System.out.println(countPeaks(c));
		System.out.println(countPeaks(d));
		System.out.println(countPeaks(e));
		
	}
	
}

