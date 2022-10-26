package java0907;

import java.util.Scanner;

public class Ex05_연산자실습5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//삼항연산자 결과값을 담을 수도 있다.
		System.out.println(a%2==0?"a는짝수":"a는 홀수");
		System.out.println(b%2==0?"b는짝수":"b는 홀수");
		
		

	}

}
