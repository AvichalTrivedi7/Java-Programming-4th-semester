// Array and loop related programmes (missed due to medical leave)

import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // inputting and reversing
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();	
	}

}

/*
public class Array2 
{

	public static void main(String[] args) 
	{
		        int[] bucket = {1, 2, 3, 4, 5};
		    		        
		    		  System.out.println("Index \t Values");
		    		   for (int count = 0; count < bucket.length; count++)
		    		   {
		    		            System.out.println(count + "\t" + bucket[count]);
		    		   }
		    		        
		    		    System.out.print("Reverse order: ");
		    		    for (int count = bucket.length - 1; count >= 0; count--) 
		    		    {
		    		      System.out.print(bucket[count] + " ");
		    		    }
		    		        System.out.println();
		    		    }
	sc.close();	       
    }
*/