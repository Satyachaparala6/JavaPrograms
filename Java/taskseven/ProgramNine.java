package taskseven;

public class ProgramNine {

	public static void main(String[] args) {
		int arr[] = {5,2,6,8,2,1};
		int max = arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max element:"+max);
	}
}
