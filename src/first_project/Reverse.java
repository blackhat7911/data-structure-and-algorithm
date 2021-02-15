package first_project;
import java.util.Scanner;

public class Reverse {
	
	public int reverse(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num/10;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		
		Reverse rev = new Reverse();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers : ");
		int input = sc.nextInt();
		
		System.out.println("Reversed number is "+rev.reverse(input));

		
	}
	
}