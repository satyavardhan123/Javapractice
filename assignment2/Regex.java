package satya;

public class Regex {
	 public static boolean checkWebAddressValidity(String webAddress) {
		 String s="^[http|https](://)(www.)?[A-Za-z[0-9]]{2,8}+.[com|org|net]$";
		 if (webAddress.matches(s))
		    return false; 
		 else
			 return true;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webAddress = "http://www.company.com";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));

	}

}
