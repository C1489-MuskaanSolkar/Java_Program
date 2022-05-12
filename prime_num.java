package prime_num;
import java.util.Scanner;
public class prime_num {
	public static void main(String[] args) {
		
		 int num;
		Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter number");
		  num=sc.nextInt();
				 

	    
	       if(num%2==0)
	       {
	    	   System.out.println("It is a prime number");
	       }
	       else {
	    	   System.out.println("It is not a prime number");
	    }
	}

}
