package armstrong;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int num ,r,s=0,num1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		num1=num;
		do {
			r=num%10;
			s=s+r*r*r;
			num=num/10;
		}
		
		while(num>0);
		{
			if(num1==s)
			{
				System.out.println("This is armstrong");
				
			}
			else {
				System.out.println("This is not an armstrong");
			}
		}

	}

}
