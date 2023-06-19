package taskseven;

public class ProgramFive {

	public static void main(String[] args) {
		String str = "Java is programming Language";
		int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
       System.out.println("Number of words in string:"+count);
	}
}
