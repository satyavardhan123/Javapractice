package satya;
class Participant{
	private static int counter;
	private String registerid;
	private String name;
	private long contactnum;
	private String city;
	static {
		counter=10000;
	}
	public Participant(String name,long contactnum, String city) {
		this.registerid ="D"+ ++counter;
		this.name = name;
		this.contactnum = contactnum;
		this.city = city;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Participant.counter = counter;
	}
	public String getRegisterid() {
		return registerid;
	}
	public void setRegisterid(String registerid) {
		this.registerid = registerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactnum() {
		return contactnum;
	}
	public void setContactnum(long contactnum) {
		this.contactnum = contactnum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Participant participant1=new Participant("Franklin",7656784323L,"Texas");
		Participant participant2=new Participant("Merina",7890423112L,"New york");
		Participant[] participants= {participant1,participant2};
		for (Participant participant:participants) {
			System.out.println("Hi "+participant.getName()+" !Your registration id is "+participant.getRegisterid());
		}

	}

}
