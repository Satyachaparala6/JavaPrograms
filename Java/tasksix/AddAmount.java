package tasksix;

public class AddAmount {

	private int amount=50;

	public AddAmount(int amount) {
		this.amount = amount;
	}

	public AddAmount() {
	}
	public void display() {
		System.out.println("Amount in Saving Box:" + amount);
	}
	
	public static void main(String[] args) {
		AddAmount amount1 = new AddAmount();
		AddAmount amount2 = new AddAmount(60);
		amount1.display();
		amount2.display();
	}
}
