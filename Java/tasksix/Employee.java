package tasksix;

public class Employee {

	String name;
	String yearOfJoining;
	String address;
	public Employee(String name, String yearOfJoining, String address) {
		super();
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	public void display() {
		System.out.println("name:"+ name +"\nyearOfJoining:"+ yearOfJoining + "\naddress"+ address);
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee("Robert", "1994", "64C- Walls Streat");
		Employee employee2 = new Employee("Sam", "2000", "68B- Walls Streat");
		Employee employee3 = new Employee("John", "1999", "24D- Walls Streat");
		employee1.display();
		employee2.display();
		employee3.display();
	}
}
