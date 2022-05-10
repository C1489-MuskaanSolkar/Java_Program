#WAP to accept two no and choice from user for arithmetic operation and  display the output
package arithmetic;
import java.util.Scanner;
public class arithmetic {

	public static void main(String[] args) {
	int num1,num2,choice,res;
Scanner sc =new Scanner(System.in);


System.out.println("Enter your choice");
choice=sc.nextInt();
System.out.println("1 + \n 2 - \n 3 * \n 4 / \n 5 %");

switch(choice) {
case 1:
	System.out.println("Enter two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1+num2;
	System.out.println("Addition of two numbers are:" +res);
	break;
	
case 2:
	System.out.println("Enter two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1-num2;
	System.out.println("Subtraction of two numbers are:" +res);
	break;
	
case 3:
	System.out.println("Enter two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1*num2;
	System.out.println("Multiplication of two numbers are:" +res);
	break;
	
case 4:
	System.out.println("Enter two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1/num2;
	System.out.println("Division of two numbers are:" +res);
	break;
	
case 5:
	System.out.println("Enter two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1%num2;
	System.out.println("mod of two numbers are:" +res);
	break;
	
	default:
		System.out.println("It is invalid");
		break;
}
	}

}
