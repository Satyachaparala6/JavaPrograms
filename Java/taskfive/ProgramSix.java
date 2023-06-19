package taskfive;

public class ProgramSix {

	public static void main(String[] args) {
		String str = "heLLo WOrLd";
		
		StringBuffer str1 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			  char c = str.charAt(i);
			   if (Character.isUpperCase(c)) {
			      c = Character.toLowerCase(c);
			   }
			   if (Character.isLowerCase(c)) {
			      c = Character.toUpperCase(c);
			   }
			   str1.append(c);
			}
		System.out.println("Result:"+ str1.toString());
	}
}
