package assignments;

import java.util.Scanner;

public class WritingBubbleSortProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements of an array: ");
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-1;j++)
			{
				int k=j+1;
				int a=arr[j];
				int b=arr[k];
				if(b<a)
				{
					arr[j]=b;
					arr[k]=a;
				}
			}
		}
		for(int d=0;d<length;d++)
		{
			System.out.print(arr[d]+" ");
		}
	}

}
