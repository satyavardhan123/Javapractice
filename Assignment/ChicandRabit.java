package str1;
import java.util.Scanner;
public class ChicandRabit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner input= new Scanner(System.in);
		int heads,r,c,legs;
		heads=input.nextInt();
		legs=input.nextInt();
		if (legs%2!=0)
			System.out.println("cannot found");
		else {
			r=(legs-2*heads)/2;
		  c=Math.abs(heads-r);
		  System.out.println("number of rabbits"+r);
		  System.out.println("number of chickens"+c);
		}

	}

}
