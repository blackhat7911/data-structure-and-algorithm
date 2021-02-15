package first_project;

public class Weather {
	
	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = false;
		double tempr = 40;
		
		if(isSnowing == true || isRaining == true || tempr < 50) {
			System.out.println("Stay home");
		}
		else { 
			System.out.println("Lets go out");
		}
	}
	
}
