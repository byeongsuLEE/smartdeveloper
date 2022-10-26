package 조건문;

import java.util.Scanner;

public class Ex03_ifelse문 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 정수:");
		int num = sc.nextInt();
		
//		System.out.println(num%2==0?"10은 짝수입니다.":"홀수는(은) 짝수입니다.");
		if (num%2==0)
		{
			System.out.println(num + "은 짝수입니다.");
		}
		else
		{
			System.out.println(num + "은 홀수입니다.");

		}
		
	}

}
