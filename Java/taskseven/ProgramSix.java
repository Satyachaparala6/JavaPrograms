package taskseven;

public class ProgramSix {

	public static void main(String[] args) {
		 int num = 153;
		int total = 0;
        int temp = num;
        int digit = 0;
        while (num!= 0)
        {
            digit = num % 10;
            total += Math.pow(digit, 3);
            num /= 10;
        }
        if(total == temp)
            System.out.println(temp+ " is an Armstrong number");
        else
            System.out.println(temp+ " is not an Armstrong number");
	}
}
