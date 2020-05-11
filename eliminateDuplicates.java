package javaapplication8;

import java.util.Scanner;

public class eliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
	int [] numbers = new int [5];
        int number;
	int temp;
		
	for(int i = 0; i < numbers.length; i++)
	{
            boolean numberExists = false;
            
            System.out.println();
            System.out.print("Enter a number: ");
	    number = input.nextInt();
            
            temp = number;
			
	    for(int item: numbers)
	    {
		if(item == temp)
                {
                    System.out.print(item + " has already been entered");
                    numberExists = true;
                    break;
                } 
	    }
            
            if(numberExists == true)
            {
                System.out.println();
                for(int x: numbers)
                {
                   if(x != 0)
                   {
                      System.out.print(x + " ");
                   }
                }
                continue;
            }
            else 
            {
                numbers[i] = temp;
            
                for(int x: numbers)
                {
                   if(x != 0)
                   {
                      System.out.print(x + " ");
                   }
                }
            }
	}
        
        System.out.println();
        System.out.println();
        
        /* Printing the array elements to see if all the 
           non-duplicate elements are being entered in or not.
        for(int element: numbers)
        {
            System.out.print(element + " ");
        } */
    }
    
}
