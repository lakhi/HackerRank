package javaexercise.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      sc.nextLine();
	      HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
	      
	      for(int i=0;i<n;i++)
	      {
	         String name=sc.nextLine();
	         int phone=sc.nextInt();
	         phonebook.put(name, phone);
	         sc.nextLine();
	      }
	      
	      while(sc.hasNext())
	      {
	         String s=sc.nextLine();
	         if (phonebook.containsKey(s))
	        	 System.out.println(s + '=' + phonebook.get(s));
	         else
	        	 System.out.println("Not found");
	      }
	      sc.close();
	}

}
