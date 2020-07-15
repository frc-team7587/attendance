

public class Loops {
	public static void main(String[] args) {
	
		//whileLoop();
		//doWhileLoop();
		forLoop();
	}
	
	static void whileLoop() {
		int counter = 9;
		while(counter < 10) {
			counter = counter + 1;
			System.out.println(counter);
		}
	}
	
	static void doWhileLoop() {
		int counter = 10;
		do {
			counter = counter + 1;
			System.out.println(counter);
		} while (counter < 10);
	}
	
	static void forLoop() {
		//for(initialize counter; condition to see if we should run the loops;  change counter variable AFTER it runs
		for(int counter = 1; counter <= 10;) {
			System.out.println(counter);
		}
	}
}
