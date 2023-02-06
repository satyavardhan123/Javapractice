package assign;

import java.util.Scanner;

public class Assess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the account number: ");
	    int accountnumber = scanner.nextInt();
	    System.out.print("Enter the account balance: ");
	    int accountbalance = scanner.nextInt();
	    System.out.print("Enter the salary: ");
	    int salary = scanner.nextInt();
	    System.out.print("Enter the loan type ");
	    String loantype = scanner.next();
	    System.out.print("Enter the expected loan amount: ");
	    int expectedloanamount = scanner.nextInt();
	    System.out.print("Enter the expected number of EMIs: ");
	    int expectedemi = scanner.nextInt();
	    if (accountnumber < 1000 || accountnumber > 1999) {
	        System.out.println("Account number should be a 4-digit number starting with 1");
	      }
	    if (accountbalance < 1000) {
	        System.out.println("Account balance should be at least 1000");
	    }
	    int elb=0,emi=0;
	    if (salary>25000 && salary<50000) {
	    	elb=500000;
	    	emi=36;
	    	 }
	    else if(salary>50000 && salary<75000) {
	    	elb=6000000;
	    	emi=60;
	    }
	    else {
	    	elb=7500000;
	    	emi=84;
	    }
	    System.out.println("elligible loan amount "+elb);
	    System.out.println("expected emis "+emi);

	}

}
