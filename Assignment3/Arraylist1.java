package f1;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist1{
	public static Integer max(ArrayList<Integer> list) {
		 if (list == null || list.size() == 0) {
		        return null;
		    }
		    
		    Integer max = list.get(0);
		    for (Integer num : list) {
		        if (num > max) {
		            max = num;
		        }
		    }
		    return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        System.out.print("Enter range");
	        int num = sc.nextInt();
	        for (int i=0;i<num;i++) {
	        	System.out.println("Enter number ending with 0 :");
	        	int a=sc.nextInt();
	        	list.add(a);
	        	
	       }
	        Integer max = max(list);
	        if (max == null) {
	            System.out.println("The list is empty");
	        } else {
	            System.out.println("The largest number is: " + max);
	        }
	        
	    }

}
