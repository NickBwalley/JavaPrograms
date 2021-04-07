package arrayList2;

import java.util.Scanner;
import java.util.ArrayList;
import arrayList3.NickFury;
public class Main {

	public static void main(String[] args) {
		//classArrayList();
		//arrayLists nick = new arrayLists();
		NickFury nick = new NickFury();
		nick.basketBall();
	}

	//array list 
	public static void classArrayList() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> DBIT = new ArrayList<String>();
		String firstName;
		String surName;
		String stdNo;
		String concat;
		char quit = 'Y';
		
		while(quit == 'Y') {
			System.out.println("Enter Your Sur-Name: ");
			surName = input.next();
			System.out.println("Enter Your firstName: ");
			firstName = input.next();
			System.out.println("Enter Your Students-Number: ");
			stdNo = input.next();
			concat = "---------------------------------------";
			
			DBIT.add(surName);
			DBIT.add(firstName);
			DBIT.add(stdNo);
			DBIT.add(concat);
			
			System.out.println("ANOTHER RECORD? Y/N");
			String word;
			word = input.next();
			word = word.toUpperCase();
			quit = word.charAt(0);
		}
		
		System.out.println("Records Entered are: ");
		for(String z: DBIT)
			System.out.println(z);
		
		
		
	}
}
