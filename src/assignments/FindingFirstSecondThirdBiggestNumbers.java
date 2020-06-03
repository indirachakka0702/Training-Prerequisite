package assignments;

import java.util.Scanner;

public class FindingFirstSecondThirdBiggestNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of second number: ");
		int b= sc.nextInt();
		System.out.println("Enter the value of third number: ");
		int c=sc.nextInt();
		sc.close();
		if(a>b && a>c)
		{
			System.out.println("a= "+a+" is First greater number");
			if(b>c)
			{
				System.out.println("b= "+b+" is Second greater number");
				System.out.println("c= "+c+" is Third greater number");
			}
			else
			{
				System.out.println("c= "+c+" is Second greater number");
				System.out.println("b= "+b+" is Third greater number");
			}
		}
			else if(b>c)
			{
				System.out.println("b= "+b+" is First greater number");
				if(c>a)
				{
					System.out.println("c= "+c+" is Second greater number");
					System.out.println("a= "+a+" is Third greater number");
				}
				else
				{
				   System.out.println("a= "+a+" is Second greater number");
				   System.out.println("c= "+c+" is Third greater number");
				   
				}
			}	
			else
			{
				System.out.println("c= "+c+" is First greater number");
				if(a>b)
				{
					System.out.println("a= "+a+" is Second greater number");
					System.out.println("b= "+b+" is Third greater number");
				}
				else
				{
					System.out.println("b= "+b+"is Second greater number");
					System.out.println("a= "+a+"is Third greater number");
				}
			}
	


	}

}
