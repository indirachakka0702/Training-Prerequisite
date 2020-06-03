package assignments;

import java.util.Scanner;

public class ReverseWordInaString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s=sc.nextLine();
	sc.close();
	String s1=new StringBuffer(s).reverse().toString();
		System.out.println("Before Reverse: "+s);
		System.out.println("After Reverse: "+s1);
	}

}
