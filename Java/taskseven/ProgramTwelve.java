package taskseven;

public class ProgramTwelve {

	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
		for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
 
            if (currentSum == sum) {
                System.out.println("Sum found at index "
                                   + i);
                return;
            }
            else {
             
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
 
                    if (currentSum == sum) {
                        System.out.println(
                            "Sum found between index " + i+ " and " + j);
              
                    }
                }
           }

		}
}
}
