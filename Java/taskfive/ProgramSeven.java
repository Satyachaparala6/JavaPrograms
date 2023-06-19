package taskfive;

public class ProgramSeven {

	public static void main(String[] args) {
		int i = -1;
		String str = "({{)}[}]() ";
		boolean res = false;
        char[] arr = new char[str.length()];
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
            	arr[++i] = ch;
            else {
                if (i >= 0
                    && ((arr[i] == '(' && ch == ')')
                        || (arr[i] == '{' && ch == '}')
                        || (arr[i] == '[' && ch == ']')))
                    i--;
                else
                	res = false;
            }
        }
        if(i== -1) {
        	res = false;
        }
        else
        	res = true;
      System.out.println("res:"+ res);
	}
}
