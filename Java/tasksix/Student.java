package tasksix;

public class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}
	public Student() {
		this.name = "Unknown";
	}
	
	public void display() {
		System.out.println("Name of student:"+name);
	}
	public static void main(String[] args) {
		Student s= new Student("Satya");
		Student s1= new Student();
		s.display();
		s1.display();
	}
	
}
