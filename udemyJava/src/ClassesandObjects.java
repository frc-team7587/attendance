public class ClassesandObjects {
	public static void main(String[] args) {
		Person john = new Person("John"); //you just created an instance of the Person class, which is "John"
		john.setAge(20);
		Person bob = new Person("Bob");  //you just created an instance of the Person class, which is "Bob"
		bob.setAge(25);
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old.");
		System.out.println(bob.getName() + " is "+ bob.getAge() + " years old.");
		
		
		
	}
}
