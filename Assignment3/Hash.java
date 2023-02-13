package f1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> student=new HashSet<>();
		Scanner in=new Scanner(System.in);
		System.out.println("enter names of students");
		while(true) {
			String name=in.next();
			if(name.equalsIgnoreCase("none"))
				break;
			student.add(name);
		}
		Set<String> str=new TreeSet<>(student);
		System.out.println("students attended the course");
		for(String a:str) {
			System.out.println(a);
		}

	}

}
