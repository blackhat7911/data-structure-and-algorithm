package array;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int row = array.length;
		int column = array[0].length;
		
		System.out.println("Two D Array is given below: ");
		
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}
}
