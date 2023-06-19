package taskseven;

public class ProgramTwo {

	public static void main(String[] args) {
		  String str1 = "Java";
		  for (int i = 0; i < str1.length(); i++) {
		   boolean result = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		    	result = false;
		     break;
		    }
		   }
		   if (result) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
	}
}
