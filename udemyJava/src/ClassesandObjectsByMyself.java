
public class ClassesandObjectsByMyself {
	public static void main(String[] args) {
		Classroom geometry = new Classroom("Geometry");
		geometry.setTeacher("Mrs. Lifson");
		geometry.setGrade(9);
		geometry.setFun(false);
		Classroom java = new Classroom("Java");
		java.setTeacher("Mr.Tang");
		java.setFun(true);
		
		geometry.whatIsIt();
		java.whatIsIt();
	}
	
}
