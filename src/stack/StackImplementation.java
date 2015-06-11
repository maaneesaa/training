package stack;

public class StackImplementation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(3);
		s.push(1345);
		s.push(555);
		s.push(679);
		s.push(435);
		s.stackString();	
		System.out.println("The size of the Stack is: " + s.size());
	
		Stack st = new Stack();
		st.stackString();
		
		System.out.println(s.isEmpty());
	}
	public static void test(){
		
	}
}
