package java0913;

import java.util.Scanner;

public class Ex01_while1 {
	public static void main(String[] args) {
		// 문제1
		// while문을 사용하여 키보드로부터 입력받은 수가 10보다 작을때만 계속 입력받으세요
//		//해결법1
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int a=sc.nextInt();
//		
//		while(a<10)
//		{
//			System.out.print("정수 입력 : " );
//			a = sc.nextInt();
//			
//			
//			
//		}
//		System.out.println("종료되었습니다.");
//		
//		
//	
		//해결법 2
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			a= sc.nextInt();
			
			if (a >=10 ) 
			{
				
				
				break;
			}

		}
		System.out.println("종료되었습니다.");

	}

}
