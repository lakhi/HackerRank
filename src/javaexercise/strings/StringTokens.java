package javaexercise.strings;

import java.util.*;

public class StringTokens {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String regex = "[!,?._'@ ]+";
        
        String[] tokens = s.split(regex);
        System.out.println(tokens.length);
        for(String token : tokens) {
        	System.out.println(token);
        }
    }

}
