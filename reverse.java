package reverse;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {

		int num=12345,rev=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		num=sc.nextInt();
		
		while (num!=0)
		{
			int remainder = num%10;
			rev=(rev*10) + remainder;
			num=num/10;
		}
		System.out.println("Reverse is:" +rev);
	}
}
