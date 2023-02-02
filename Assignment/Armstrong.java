package str1;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner input= new Scanner(System.in);
		int i,len=0,a,b,num=input.nextInt();
		int rem,res=0;
		b=num;
		while (b!=0)
		{
			len+=1;
			b=b/10;
		}
		b=num;
		while (b!=0)
		{
			rem=b%10;
			res+=Math.pow(rem,len);
			b=b/10;
			
		}
		if (res==num)
			System.out.println("armstrong number");
		else 
			System.out.println("not armstrong number");
		

	}

}
