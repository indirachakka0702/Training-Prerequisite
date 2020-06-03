package assignments;

import java.util.Scanner;

public class ReverseStringwithoutUsingReverseCommand {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s= sc.next();
		sc.close();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
}
}

