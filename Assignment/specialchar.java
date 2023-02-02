package str1;
import java.util.Scanner;
public class specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		int len;
		String a="",b="";
		len=s1.length();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (Character.isLetterOrDigit(ch))
			{
				a+=ch;
			}
			else
			{
				b+=ch;
			}
		}
		System.out.println(a+b);
		

	}

}
