package Practice;

import java.util.Arrays;

public class Anagram {
	
public static void main(String[]args) {
		
		String x = "ARADHYA";
		String y= "Srajen";
		
		char[]a=x.toCharArray();
		char[]b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a,b);
		
		if(result==true) {
			System.out.println("Your string is anagram");
		}
		else if(result==false) {
			
			System.out.println("Your string is non-anagram");
		}
		System.out.println("More to go and learn");
		System.out.println("learning should never be stopped");
		System.out.println("I am your dad");
	}

}
