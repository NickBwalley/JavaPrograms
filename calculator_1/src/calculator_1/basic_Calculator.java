package calculator_1;

import java.util.Scanner;
public class basic_Calculator {

	public static void main(String[] args) {
		Scanner rikki = new Scanner(System.in);
		double fNum, lNum, answer;
		System.out.println("Enter First Number: ");
		fNum = rikki.nextDouble();
		System.out.println("Enter Last Number: ");
		lNum = rikki.nextDouble();
		answer = fNum + lNum;
		System.out.println(answer);
	}

}
