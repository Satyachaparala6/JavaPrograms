package taskfive;

public class ProgramTwo {

	public static void main(String[] args) {
		int[] arr = {6,9,2,5,1,3};
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			sum  += arr[i];
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		int result = (sum-max-min);
		System.out.println("Sum:" + sum);
	}
}
