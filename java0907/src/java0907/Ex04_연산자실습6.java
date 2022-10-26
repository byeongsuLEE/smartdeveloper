package java0907;

import java.util.Scanner;

public class Ex04_연산자실습6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		System.out.println("뺀값 : "+ (a<b?b-a:a-b));
	}

}
