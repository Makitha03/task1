import java.util.Scanner;

public class Pattern 
{
   	 public static void main(String[] args) 
	{
        
        		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the value for k: ");
        		int k = scanner.nextInt();
      		  for (int i = 0; i < k; i++) 
		{
          
           			 for (int j = 0; j < k; j++)
         			{
               				 if (j < i) 
				{
                  					  System.out.print(k - i);
                       				 } 
				else 
				{
                   					 System.out.print(k - j);
                				}
            			}
           
            			System.out.println();
        		}
		scanner.close();
       
       
    }
}
