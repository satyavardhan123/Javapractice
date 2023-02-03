package satya;
class Tv1{
	private int channel;
	private int volumlvl;
	private boolean specify;
	public Tv1(int channel, int volumlvl, boolean specify) {
		this.channel = channel;
		this.volumlvl = volumlvl;
		this.specify = specify;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolumlvl() {
		return volumlvl;
	}
	public void setVolumlvl(int volumlvl) {
		this.volumlvl = volumlvl;
	}
	public boolean isSpecify() {
		return specify;
	}
	public void setSpecify(boolean specify) {
		this.specify = specify;
	}
	public void turnon() {
		if (specify==false) {
			System.out.println("TV turned on");
		}
	}
	public void turnoff() {
			if (specify==true) {
				System.out.println("TV turned off");
			}	
	}
	public void setchannelup() {
		if (channel>=1 && channel<120 && specify==true) {
			channel+=1;
			System.out.println("new channel"+channel);
		}
	}
	public void setchanneldown() {
		if (channel>1 && channel<=120 && specify==true) {
			channel-=1;
			System.out.println("new channel "+channel);
		}
	}
	public void setvolumeup() {
		if (volumlvl>=1 && volumlvl<7 && specify==true) {
			volumlvl+=1;
			System.out.println("new volume "+volumlvl);
		}
	}
	public void setvolumedown() {
		if (volumlvl>1 && volumlvl<=7 && specify==true) {
			volumlvl-=1;
			System.out.println("new volume "+volumlvl);
		}
	}
		
}
public class TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv1 tv=new Tv1(2,3,true);
		tv.turnon();
		tv.setvolumedown();
		tv.setvolumeup();
		tv.setchanneldown();
		tv.setchannelup();
		tv.turnoff();

	}

}
