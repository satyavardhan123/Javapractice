package str;
import java.lang.Runnable;
import java.lang.Thread;

class printchar implements Runnable{
	private char c;
	private int t;
	private int ts;
	public printchar(char d, int i, int j) {
		this.c=c;
		this.t=t;
		this.ts=ts;
	}
	public void run() {
		try {
			Thread.sleep(50);
			System.out.print(c);
			Thread.sleep(ts);
			for(int i=1;i<t;i++)
				System.out.println(c);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class printn implements Runnable{
	private int n1;
	public printn(int n1) {
		this.n1=n1;
	}
	public void run() {
		try {
			System.out.println("1");
			Thread.sleep(100);
			for(int i=2;i<n1;i++)
				System.out.println(i);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable printa=new printchar('a',100,200);
		Runnable printb=new printchar('b',100,100);
		Runnable printnum=new printn(100);
		Thread thread1=new Thread(printa);
		Thread thread2=new Thread(printb);
		Thread thread3=new Thread(printnum);
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
