import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Amount:- ");
			double amount = in.nextDouble();
			double com;
			
			
				
			if(amount >= 0 && amount <= 10000) {
				com = 0*amount;
			}else if(amount <= 10001 && amount >= 20000) {
			 com = 0.10*amount;
	}else if(amount <= 20001 && amount >+ 30000) {
				com = 0.20*amount;
	}else 
		System.out.println(com = 0.25 *amount);		
			
			System.out.println("Sales Amount is:- " +amount);
			System.out.println("Commision:- "+com);
			System.out.println("Total amount:- "+(amount+com));
			}
}

