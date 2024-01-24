package logic;

import java.util.Scanner;

public class fibonacci {
	static long f = 1;
	static long n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");

		n = sc.nextInt();
		while (n > 1) {

			if (n <= 1) {
				System.out.println(1);
			} else {
				f = f * n;

			}
			n--;
		}
		System.out.println(f);
	}
}
