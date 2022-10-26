package 조건문;

import java.util.Scanner;

public class EX07_switch문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		int fan = sc.nextInt();
		
		switch (fan)
		{
		case 1:
			System.out.println("약한 바람이 나옵니다");
			break;
		
		case 2:
			System.out.println("중간 바람이 나옵니다.");
			break;
		case 3:
			System.out.println("강한 바람이 나옵니다.");
			break;
				
		default:
			System.out.println("잘못입력하셧네요? ");
			
			break;		
				
				
			
		}
		System.out.println("dkdkdkdkd");

	}

}
