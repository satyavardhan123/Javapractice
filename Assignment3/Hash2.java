package f1;
import java.util.Set;
import java.util.HashSet;
public class Hash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> stack1=new HashSet<>();
		stack1.add("chemistry");
		stack1.add("mathematics");
		stack1.add("biology");
		stack1.add("english");
		Set<String> stack2=new HashSet<>();
		stack2.add("biology");
		stack2.add("english");
		stack2.add("geography");
		stack2.add("physics");
		Set<String> s1=new HashSet<>(stack1);
		s1.removeAll(stack2);
		System.out.println("subjects present in stack1"+s1);
		Set<String> s2=new HashSet<>(stack2);
		s2.removeAll(stack1);
		System.out.println("subjects present in stack2"+s2);
		stack1.retainAll(stack2);
		System.out.println("subjects present in both stacks"+stack1);
		
		
		
		

	}

}
