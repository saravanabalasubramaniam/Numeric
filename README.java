import java.io.*;
import java.util.*;
class Numeric
{
public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
    	System.out.println("Enter an integer : ");
    	if (input.hasNextInt()) 
		{
       		System.out.println("The input is numeric");
    		} 	
	else 	
		{
       		System.out.println("The input is not an Numeric");
 		}
	}
}
