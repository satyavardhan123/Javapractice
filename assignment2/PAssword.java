package satya;

public class PAssword {
	 public static boolean checkPasswordValidity(String password) {
		 String a="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%&\\*_])[a-zA-Z\\d!@#\\$%&\\*_]{8,20}";
		 if (password.matches(a))
			 return true;
		 else
			 return false;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "P@$sW0rd";
		System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));

	}

}
