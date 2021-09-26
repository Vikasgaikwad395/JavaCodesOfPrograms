import java.util.Scanner;

public class Calculator {
				public static void main(String[] args) {
					int num1,num2,result,option;
					Scanner in = new Scanner(System.in);
				
				do {
					System.out.println("*****MY CALCULATOR APP****");
					System.out.println("==========================");
					System.out.println("1.Addtion");
					System.out.println("2.Substraction");
					System.out.println("3.Multiplication");
					System.out.println("4.Division");
					System.out.println("0.Exit");
					System.out.println("Please Choose a option");
					option = in.nextInt();
				
				switch(option) {
				
				case 1:
							System.out.println("Enter Number1:-");
							num1 = in.nextInt();
					
							System.out.println("Enter Number2:- ");
							num2 = in.nextInt();	
							result = num1 + num2;
							System.out.println("Result is:- "+result);
							break;
					
				case 2:
							System.out.println("Enter Number1:-");
							num1 = in.nextInt();
					
							System.out.println("Enter Number2:- ");
							num2 = in.nextInt();
							result = num1 - num2;
							System.out.println("Result is:- "+result);
							break;
					
				case 3:
							System.out.println("Enter Number1:-");
							num1 = in.nextInt();
					
							System.out.println("Enter Number2:- ");
							num2 = in.nextInt();
							result = num1 * num2;
							System.out.println("Result is:- "+result);
							break;
										
				case 4 :
							System.out.println("Enter Number1:-");
							num1 = in.nextInt();
				
							System.out.println("Enter Number2:- ");
							num2 = in.nextInt();
							result = num1 / num2;
							System.out.println("Result is:- "+result);
							break;
							
				case 0:
							System.out.println("Bye");
							System.out.println("😍️Thanks for using app😍️");
							System.exit(0);
			default :
					System.out.println("Please choose a correct option");
					break;
				}
		
			}while( option != 0);
		}
}
