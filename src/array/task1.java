package array;
import java.util.Scanner;

public class task1 {
	
	public static void main(String[] args) {
		
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 2d array : ");
		int n = sc.nextInt();
		
		int array[][] = new int[n][n];
		//add to array
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Enter number at posn " + i + " " + j);
				int num = sc.nextInt();
				array[i][j] = num;
			}
		}
		//print
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
