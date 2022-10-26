package 조건문;

import java.util.Scanner;

public class Ex06_다중if문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (10<=age && age<20)
		{
			System.out.println("10대입니다.");
			
		}
		
		else if(age<30)
		{
			System.out.print("20대입니다.");
		}
		else if (age <40)
		{
			System.out.print("30대입니다.");
		}
		
	}

}
