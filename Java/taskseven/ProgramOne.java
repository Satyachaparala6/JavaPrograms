package taskseven;

public class ProgramOne {

	public static void main(String[] args) {
		String s = "Java";
		String result = "";
		for(int i = s.length()-1; i>=0;i--) {
			char ch = s.charAt(i);
			result = result + ch;
		}
		System.out.println("Reverse string:"+result);
	}
}
