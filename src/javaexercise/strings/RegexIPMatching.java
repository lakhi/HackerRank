package javaexercise.strings;

/*import java.util.regex.Matcher;
import java.util.regex.Pattern;*/
import java.util.Scanner;

class myRegex {
	String pattern;
	
	myRegex() {
		String A = "[[01]?[0-9]?[0-9]]"; // only first part works at the moment. Answer is this: ([01]?[0-9]?[0-9])|(2([0-4][0-9]|5[0-5]))
		pattern = A + "." + A + "." + A + "." + A;
	}
}

class RegexIPMatching {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
        in.close();
	}

}
