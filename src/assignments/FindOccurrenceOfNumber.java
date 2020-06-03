package assignments;
import java.util.Scanner;

public class FindOccurrenceOfNumber {
	
	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the length: ");
          int length=sc.nextInt();
          int arr[]=new int[length];
          for(int i=0;i<length;i++)
          {
        	  System.out.println("Enter the element of an array: ");
        	   arr[i]=sc.nextInt();
          }
          sc.close();
    int fre[]=new int[arr.length];
    int visited=-1;
    for(int i=0;i<arr.length;i++)
    {
    	int count=0;
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]==arr[j])
    		{
    			count++;
    			fre[j]=visited;
    		}
    	}
    	if(fre[i]!=visited)
    		fre[i]=count;
    }
    for(int i=0;i<fre.length;i++) {
    	if(fre[i]!=visited)
    		 System.out.println(arr[i]+" occures "+fre[i]+" times ");
    }
   
         
}
}
