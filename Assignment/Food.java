package str1;
import java.util.Scanner;
public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter input");
		Scanner input= new Scanner(System.in);
		char ch;
		ch=input.next().charAt(0);
        int num=input.nextInt();
        int cost=0,dis=input.nextInt();
        if (ch=='N')
        {
        	cost=num*15;
        	if (dis<=6)
        	{
        		dis=dis-3;
        		if (dis>0)
        		{
        			cost+=dis*1;
        		}
        	}
        	else 
        		cost+=(dis-6)*2+3;
        
        System.out.println(cost);
        }
        if (ch=='V')
        {
        	cost=num*12;
        	if (dis<=6)
        	{
        		dis=dis-3;
        		if (dis>0)
        		{
        			cost+=dis*1;
        		}
        	}
        	else 
        		cost+=(dis-6)*2+3;
        
        System.out.println(cost);
        }
		
		

	}

}
