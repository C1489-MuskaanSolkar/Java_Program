package odd_demo;

import java.util.Scanner;

public class odd_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num %2==0)
			
		{
			System.out.println("Number is Even");
			
		}
		else {
			System.out.println("Number is Odd");
		}
	}
	
	}


