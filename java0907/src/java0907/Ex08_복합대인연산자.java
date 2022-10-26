package java0907;

import java.util.Scanner;

public class Ex08_복합대인연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("두개의 수를 입력하세요");
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("두개의 합은 :"+ (a+b));
		System.out.println("두개의 뺄셈 :"+(a-b));
		System.out.println("두개의 몫은 :"+ (a/b));
		System.out.println("두개의 곱은 :" + a*b);
		System.out.println("두개의 나머지:" +(a%b));
		
		
		
		
	
	}

}
