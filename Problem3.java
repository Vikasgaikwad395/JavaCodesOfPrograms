import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
	
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a age");
		int age = in.nextInt();
		
		System.out.println("Enter Gender(M/F): ");
		int Gender = in.next().charAt(0);
		
		if(Gender == 'M') {
			if(age == 25) {
				System.out.println("Male is eligible for Marriage");
			}else
				System.out.println("Male is not eligible for Marriege");
			}
		if(Gender == 'F') {
			if(age == 21) {
				System.out.println("Female is eligible for Marriage");
			}else 
				System.out.println("Female is not eligible for Marriage");
		}
		
		
		
	}
}

