package str1;
import java.util.Scanner;
public class Whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner in=new Scanner(System.in);
		String a="",s1=in.nextLine();
		int len=s1.length();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (ch!=' ')
			{ 
				a+=ch;
			}

		}
		System.out.println(a);
		

	}

}
