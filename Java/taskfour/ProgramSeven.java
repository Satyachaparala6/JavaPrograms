package taskfour;

public class ProgramSeven {

	public static void main(String[] args) {
		int[] arr = {6,9,2,4,1,8}; 
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Difference between the largest and smallest value in array: "+(max-min));	
	}
}
