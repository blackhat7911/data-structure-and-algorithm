package problems;

public class Bin2Dec {
	
	public static int getDecimal(int binary) {
		int dec = 0;
		int num = 0;
		
		while(true) {
			if (binary == 0) {
				break;
			}
			else {
				int temp = binary % 10;  
				dec += temp * Math.pow(2, num);  
				binary = binary/10;  
				num++; 
			}
		}
		
		return dec;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDecimal(110));
		
	}
	
}
