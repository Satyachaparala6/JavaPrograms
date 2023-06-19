package taskfive;

import java.util.Arrays;

public class ProgramFour {

	public static void main(String[] args) {
		String str = "Java";
		boolean result = false;
		str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                result=false;
            else
            	result=true;
        }
        
        System.out.println("Result is:"+ result);
	}
}

