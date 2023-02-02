package satya;
class Applicant{
	private String name;
	private String jobprofile;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(String jobprofile) {
		this.jobprofile = jobprofile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Invalidnameexception extends Exception{
	public Invalidnameexception(String message) {
		super(message);
	}
}
class Invalidjobprofileexception extends Exception{
	public Invalidjobprofileexception(String message) {
		super(message);
	}
	}
class Invalidageexecption extends Exception{
	public Invalidageexecption(String message) {
		super(message);
	}
}
class Validator{
	public boolean validatename(String name) {
		if (name==null || name=="")
			return false;
		else
			return true;
	}
	public boolean validatejobprofile(String jobprofile) {
		if (jobprofile=="clerk" || jobprofile=="Executive" || jobprofile=="Officer")
			return true;
		else
			return false;
	}
	public boolean validateage(int age) {
		if (age>=18 && age<=30)
			return true;
	    else
		return false;
		}
	public void validate(Applicant applicant) throws Invalidnameexception,Invalidjobprofileexception,Invalidageexecption {
		if (validatename(applicant.getName())==false)
			throw new Invalidnameexception("Invalid name");
		else if(validatejobprofile(applicant.getJobprofile())==false)
			throw new Invalidjobprofileexception("Invalid jobprofile");
		else if(validateage(applicant.getAge())==false)
			throw new Invalidageexecption("Invalid age");
	}
}	
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Applicant applicant=new Applicant();
			applicant.setName("Jenny");
			applicant.setJobprofile("clerk");;
			applicant.setAge(25);
			Validator validator=new Validator();
			validator.validate(applicant);
			System.out.println("Application submitted successfully");
		}
		catch(Invalidnameexception|Invalidjobprofileexception|Invalidageexecption e) {
			System.out.println(e.getMessage());
		}

	}

}
