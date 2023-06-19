package taskfive;

import java.util.Scanner;

public class ProgramOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String sentence = sc.nextLine();
		
	    String[] words = sentence.split(" ");
	    String shortWord = words[0];
	    for (int i = 0; i < words.length; i++){
	        if (shortWord.length() > words[i].length()){
	        	shortWord = words[i];

	        }
	    }
	    System.out.println("word:"+shortWord);
	}

}
