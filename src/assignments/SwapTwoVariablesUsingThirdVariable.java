package assignments;

import java.util.Scanner;

public class SwapTwoVariablesUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number A: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number B: ");
		int b=sc.nextInt();
		sc.close();
		int c=a+b;
		    a=c-a;
		    b=c-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		

	}

}
