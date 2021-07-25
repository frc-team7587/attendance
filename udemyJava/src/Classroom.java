
public class Classroom {
	String teacher;
	String subject;
	int grade;
	boolean Fun;
	
	public Classroom(String subject) {
		this.subject = subject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return subject;
	}
	
	public String getFun() {
		if(Fun) {
			return "fun";
		}else {
			return "not fun";
		}
	}
	
	public void setFun(boolean Fun) {
		this.Fun = Fun;
	}
	
	public void whatIsIt() {
		System.out.println("This class is taught by " + getTeacher() + ". It is called: " + getSubject() + "." +  " It is " + getFun() + ".");
		
	}
	
}
