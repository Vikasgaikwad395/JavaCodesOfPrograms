import java.util.Scanner;


public class Problem1 {
		public static void main(String[] args) {
			
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter the year:-  ");
			int  year = in.nextInt();
			
			boolean leap =false; 
			
			if(year % 4 == 0)
			{
				if(year % 100 == 0) {
					if(year % 400 == 0)
						leap =  true;
						else
						leap = false;
				}else
					leap = true;
			}else
				leap = false;
			
			if(leap)
				System.out.println(year+  "   year is leap");
			else
				System.out.println(year+  "   year is not leap");
			
		}

}
