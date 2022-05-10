package vowel;
import java.util.Scanner;
public class vowel {

	char c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Character");

char c =sc.next().charAt(0);




if (c=='a'||  c=='e'||  c=='i')
{
	System.out.println("It is vowel");
}
else if(c=='o'||  c=='u')
{
	System.out.println("It is a vowel");
}
else {
	System.out.println("It is not a vowel");
}
	}

}
