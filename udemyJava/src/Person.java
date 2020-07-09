
public class Person {
	String name; // instance variable - one String variable for EVERY object created
	int age;     //static             - makes ONE age variable belong to the class
	
	public Person(String name) {
		this.name = name; //"this" refers to the instance variable, or john and bob
		/* 
		 * 1st "name" - refers to the VARIABLE
		 * 2nd "name" - refers to the PARAMETER
		 */
		System.out.println("Person created.");
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) {
		System.out.println(getName() + " said hello to " + person.getName());
		
	}
}
