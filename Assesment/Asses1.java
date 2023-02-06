package assign;

import java.util.Scanner;

public class Asses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cart[]= {"Roundneck","Roundneck","collared","Hooded","Roundneck"};
		int totalcost;
		double discount;
		System.out.println(cart);
		int a=0,b=0,c=0;
		for (int i=0;i<cart.length;i++) {
			if (cart[i]=="Roundneck")
				a+=200;
			else if(cart[i]=="collared")
				b+=250;
			else if(cart[i]=="Hooded")
				c+=300;
		}
		totalcost=a+b+c;
		System.out.println(totalcost);
		if (cart.length<5)
			discount=0;
		else if(cart.length>=5 && cart.length<10)
			discount=0.1;
		else
			discount=0.2;
		double amount;
		System.out.println(cart.length);
		amount=totalcost-(totalcost*discount);
		System.out.println("Final price is. "+amount);

	}

}
