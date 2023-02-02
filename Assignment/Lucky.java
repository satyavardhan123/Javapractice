package str1;
import java.util.Scanner;
class Luck{
	private int num;
	public Luck(int num) {
		this.num=num;
	}
	public boolean getluck() {
		int r=reverse(num);
		int i=isq(r);
		boolean ic=check(i);
		return ic;
	}
	int reverse(int n) {
		int rn=0;
		while(n!=0) {
			rn=rn*10+n%10;
			n/=10;
		}
		return rn;
	}
	int isq(int n) {
		int t=n,c=0,s=0,rn;
		while (t!=0) {
			c+=1;
			rn=t%10;
			if (c>1 && c%2==0) {
				s+=Math.pow(rn, 2);
				t/=10;
			}
			
		}
		return s;
	}
	boolean check(int n) {
		if (n%9==0)
			return true;
		else
			return false;
	}
}
public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	System.out.println("enter number");
	int inpu=input.nextInt();
	Luck l1=new Luck(inpu);
	if (l1.getluck()) {
		System.out.println("lucky number");
	}
	else
		System.out.println("not lucky number");
		
	    
	    

	}

}
