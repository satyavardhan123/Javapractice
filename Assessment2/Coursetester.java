package dxc123;

public class Coursetester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cousreregistration c1=new  Cousreregistration("Peter",5001,58,1005,true);
		 c1.validatemarks();
		 Cousreregistration c2=new  Cousreregistration("Peter",5001,66,1005,true);
		 double b=c2.validatemarks();
		 double f=c2.validatecourseid();
		 c2.caluculatefee(f, b);
		 System.out.println("student name :"+c2.getStudentname());
		 System.out.println("course id :"+c2.getCourseid());
		 System.out.println("qualifying marks :"+c2.getQualifyingmarks());
		 System.out.println("registration id :"+c2.getRegistrationid());
		 System.out.println("total fee :"+c2.getCoursefee());
		 

	}

}
