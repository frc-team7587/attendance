package udemyJava;

public class Methods {
public static void main(String[] args) {
	sayHelloWorld();
	
	sayHelloTo("Charlie");
	
	int y = returnFive();
	System.out.println(y);
	
	int result = square(5);
	System.out.println(result);
	
}
	//this returns a value and takes in data
	static int square(int x) {
		return x * x;
	}

//this method returns an int type, so YOU NEED "int" instead of "void"
	static int returnFive() {
		return 5;
	}

	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}

	static void sayHelloWorld() {
			System.out.println("Hello World!");
	}

}
