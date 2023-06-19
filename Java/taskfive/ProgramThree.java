package taskfive;

public class ProgramThree {

	public static void main(String[] args) {
		String input= "Java is programming language";
		String res = "";
		 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isWhitespace(ch)) {
            	res += ch;
            }
        }
        System.out.println(res);
	}
}
