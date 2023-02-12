package f1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new LinkedList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("enter numbers");
		int n=in.nextInt();
		while(n!=-1) {
			num.add(n);
			n=in.nextInt();
		}
		System.out.println("numbers entered");
		for(Integer a:num)
			System.out.println(a);

	}

}
