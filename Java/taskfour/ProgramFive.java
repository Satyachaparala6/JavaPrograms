package taskfour;

public class ProgramFive {

	public static void main(String[] args) {
		 int[] arr = {0,0,5,2,0,3,0,0,8};
         int i = 0;
        for(int j = 0; j< arr.length; j++) {
            if(arr[j] == 0)
                j++;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        while (i < arr.length)
        	arr[i++] = 0;
		System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : arr)
            System.out.print(n+"  ");
			System.out.print("\n");
	}
}
