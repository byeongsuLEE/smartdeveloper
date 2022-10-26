package java0913;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		while(num!=-1)
		{
			System.out.print("숫자 입력 : ");
			
			num= sc.nextInt();
			sum +=num;
			System.out.println("누적결과 : "+ sum);
			
		
		}
		System.out.println("종료되었습니다.");
		
	}

}
