package array;

import java.util.Scanner;

public class UserArray {
	public static void main(String[] args) {
		
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		// allocate array size and memory
		int random[] = new int[n]; 
		
		// insert data in array
		for(int i=0; i<n; i++){
			System.out.println("Enter number at posn "+i);
			random[i] = sc.nextInt();
		}
		
		// display created array
		for(int data : random) {
			System.out.println(data);
		}
		
	}
}
