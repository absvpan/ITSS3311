import java.util.Scanner;
public class StrictlyIdentical 
{
	public static void main(String[] args) 
	{
	   Scanner input = new Scanner(System.in);  // creation of scanner
	   System.out.print("Enter size of list 1, then its elements: ");
	   int size = input.nextInt();
	   int [] list1 =  new int [size]; // creation of array list 1
	   
	   for(int i = 0; i < size; i++) // intial for loop 
	   {
		  list1[i] = input.nextInt();
	   }
	   System.out.print("Enter size of list 2, then its elements: ");
	   
	   size = input.nextInt();
	   int[] list2 = new int[size];
	   for(int i = 0; i < size; i++)
	   {
		   list2[i] = input.nextInt(); // creation of array list 2 
	   }
	   input.close();
	   
	   if(equals(list1,list2)) // checking if both list 1 and list 2 are equal or not 
	   {
		   System.out.print("Two lists are strictly identical");
	   }
	   else
	   {
		   System.out.print("Two lists are not strictly identical");
	   }
	}
	   public static boolean equals(int[] list1, int[] list2) // method for equals
	   {
	     if(list1.length != list2.length)
	     {
	    	 return false;
	     }
	     for(int i = 0; i < list1.length; i++)
	     {
	    	 if(list1[i] != list2[i])
	    	 {
	    		 return false;
	    	 }
	     }
	     return true;
	   }
}
