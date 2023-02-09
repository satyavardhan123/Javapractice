package assign;
import java.util.Scanner;
public class Special {
	static String movespecialchar(String n) {
		int len;
		String a="",b="";
		len=n.length();
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if (Character.isLetterOrDigit(ch))
			{
				a+=ch;
			}
			else
			{
				b+=ch;
			}
	}
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		System.out.println(movespecialchar(s1));
		

	}


}
