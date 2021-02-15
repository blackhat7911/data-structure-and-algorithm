package problems;

public class TrapRainWater {
	
	public static void main(String[] args) {
		int[] list = { 4, 1, 6, 0, 9};
		int num = list.length;
		System.out.println(trapWater(list, num));
	}
	
	// function to find capacity of water that can be stored
	public static int trapWater(int[] list, int num) {
		
		// variable to store water
		int cap = 0;
		
		// loop except 1st and last element
		for (int i=1; i < (num-1); i++) {
			
			// finding max element on its left side
			int left = list[i];
			for(int j=0; j<i; j++) {
				left = Math.max(left, list[j]);
			}
			
			// finding max element on its right side
			int right = list[i];
			for(int j=0; j<i; j++) {
				right = Math.max(right, list[j]);
			}
			
			// update value of store water variable
			cap += Math.min(left, right) - list[i];
			
		}
		// returning value 
		return cap;
	
	}
		
}
