package tasksix;

public class Programming {

	private String s;

	public Programming(String s) {
		this.s = s;
		System.out.println("I love "+ s);
	}
	public Programming() {
		System.out.println("I love programming languages");
	}
	public static void main(String[] args) {
		Programming prog = new Programming();
		Programming prog1 = new Programming("Java");

	}
}

