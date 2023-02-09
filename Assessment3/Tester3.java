package assign;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher("Alex","Java Fundamental",1200L);
		Teacher t2=new Teacher("John","RDBMS",800L);
		Teacher t3=new Teacher("sam","Networking",900L);
		Teacher t4=new Teacher("Marai","Pyton",900L);
		Teacher teacher[]= {t1,t2,t3,t4};
		for(Teacher t:teacher) {
			t.dispaly();
		}

	}


}
