import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		System.out.println("Enter the age of person:-  "+age);
		
		{
		if(age  >= 18)
		System.out.println("Person is eligible for the vote");
		}
		
		{
		if(age <= 18)
			System.out.println("Person is not eligible for the vote");	
		}
	}

}

