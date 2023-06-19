package taskfour;

public class ProgramEight {

	public static void main(String[] args) {
		int arr[] = {1,5,6,8,9,1,4,3,6};
		int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[j] = arr[n-1];
                     
                    n--;
                     
                    j--;
                }
            }
        }
        System.out.println("New array length:"+ n);
	}
}
