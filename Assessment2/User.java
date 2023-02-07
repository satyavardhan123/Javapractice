package dxc123;

public class User {
	private int id;
	private String username;
	private String email;
	private double walletbalance;
	public User(int id, String username, String email, double walletbalance) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletbalance = walletbalance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletbalance() {
		return walletbalance;
	}
	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}
	 public boolean makePayment(double billamount) {
		    if (walletbalance>=billamount) {
		      walletbalance -= billamount;
		      return true;
		    }
		    return false;
		  }
	}
class Kyc extends User{
	private int rewardpoints;

	public Kyc(int id, String username, String email, double walletbalance) {
		super(id, username, email, walletbalance);
		
	}
	
	 public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

	public boolean makePayment(double billamount) {
		    if (super.makePayment(billamount)) {
		      rewardpoints+=(int)(0.1 * billamount);
		      return true;
		    }
		    return false;
		  }
	
}
class EPaywallet {
	  public static void processPaymentByUser(User user, double billamount) {
	    if (user.makePayment(billamount)) {
	      System.out.println("Payment made successfully");
	      System.out.println("Wallet balance: " + user.getWalletbalance());
	      if (user instanceof Kyc) {
	        Kyc kycUser = (Kyc) user;
	        System.out.println("Reward points: " + kycUser.getRewardpoints());
	      }
	    } else {
	      System.out.println("Payment failed. Insufficient balance.");
	    }
	  }
	}

