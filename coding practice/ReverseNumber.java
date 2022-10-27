import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		long num,n;

		String output = "";
		
		System.out.println("Program to reverse an integer entered by user using while loop.\n---");
		Scanner sm = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sm.nextInt();
		n=num;

		
		while(n>0) {
			output= output+ ""+n%10;
			n=n/10;
		}
		

		System.out.println("The reverse of "+num+" is "+output);
		
		sm.close();
		System.out.println("---\nThe Program has ended,");
	}
}
