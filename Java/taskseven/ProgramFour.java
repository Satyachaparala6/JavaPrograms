package taskseven;

import java.util.Arrays;

public class ProgramFour {

	public static void main(String[] args) {
		String str = "Java";
		boolean res = true;
		char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
            	res =  false;
            }
        }
        
        if(res) {
        	System.out.println("String has all unique characters");
        }
        else
        	System.out.println("String does not have all unique characters");
	}
}
