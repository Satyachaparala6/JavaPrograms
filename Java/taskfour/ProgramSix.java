package taskfour;

import java.util.Arrays;

public class ProgramSix {

	public static void main(String[] args) {
		int arr[] = {1,5,6,8,9,1,4,3,6};
		Arrays.sort(arr);
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
       
           for(int i =0; i<arr.length-n; i++) {
        	arr[arr.length-1-i] = 0;
        	
        }
        for(int i =0; i< arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}
}
