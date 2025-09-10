package exam2753;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if(num1%4==0 &&num1%100!=0 || num1%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");

		}
	}
}
