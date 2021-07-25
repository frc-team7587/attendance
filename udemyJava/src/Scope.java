

public class Scope {
	
	//x is declared outside of all variables, it's in the scope of all methods
	static int x; //declaring variable, it is a class variable
	
	public static void main(String[] args) {
		x = 5; //assigning a value
		System.out.println(x);
		
		doSomething(); 
		
		System.out.println(x);
	}
	
	static void doSomething() {
		x=10;
	}
	
	static void doSomethingLocally() {
		//since y is declared in this method, it is local to this method
		int y = 100; //assigning a value
	}
}
