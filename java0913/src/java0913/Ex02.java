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
			System.out.print("���� �Է� : ");
			
			num= sc.nextInt();
			sum +=num;
			System.out.println("������� : "+ sum);
			
		
		}
		System.out.println("����Ǿ����ϴ�.");
		
	}

}
