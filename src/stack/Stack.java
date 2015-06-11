package stack;

public class Stack {

	private int [] numbers ;
	private int count;
	
	//CONSTRUCTOR
	public Stack(){
		numbers = new int[10];
	}
	
	public Stack(int size){
		this.numbers = new int[size];	
	}
	
	public void push(int element){
		if(this.size() < numbers.length){
		numbers[count++] = element;
		}
		else
			System.out.println("Stack is full");
	}
	
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return count == 0;
	}
	
	public void stackString(){
		for( int i = 0; i< count; i++){
			System.out.println(numbers[i]);
		}
	}
}
