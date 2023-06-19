package taskseven;

public class ProgramTen {

	public static void main(String[] args) {
		String str = "abc";
		printcombo(str,-1,"");
	}
	public static void printcombo(String input,int j,String output)
	{
	System.out.println(output);

	        for(int i =j;i<input.length()-1;i++) 
	        { 
	            printcombo(input, i+1, output+input.charAt(i+1)); 
	        } 
	    } 
	
}
