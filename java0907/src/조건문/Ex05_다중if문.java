package 조건문;

import java.util.Scanner;

public class Ex05_다중if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int grade = sc.nextInt();
		if (grade>=90)
		{
			System.out.println("A학점");
			
		}
		else if (grade>=80)
		{
			System.out.println("B학점");
			
		}
		
		
		else if (grade>=70)
		{
			System.out.println("C학점");
			
		}
		else
		{
	
			System.out.println("재수강 ㅊㅋㅊㅋ");
		
			
		}
		

	}

}
