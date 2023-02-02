package str1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner input= new Scanner(System.in);
		int rem,b,res=0,num=input.nextInt();
		b=num;
		while (b!=0)
		{
			rem=b%10;
			res=res*10+rem;
			b=b/10;
		}
		if (res==num)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
