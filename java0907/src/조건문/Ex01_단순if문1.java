package 조건문;

import java.util.Scanner;

public class Ex01_단순if문1 {

	public static void main(String[] args) {

		//사용자가 숫자 입력할때 10보다 크면 " 10보다 큽니다 ! " 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>10)
		{
			System.out.println("a는 10보다 큽니다./");
		
		}
		System.out.println("시스템 종료 !");
	}

}
