package ���ǹ�;

import java.util.Scanner;

class Ex04_if_else��2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��Ѽ� : ");
		int num = sc.nextInt();
		
		if (num%10>=5)
		{
			num = (num/10+1) *10;
			System.out.println("�ݿø��� �� : "+num);
		}
		else
		{
			num= num/10*10;
			System.out.println("�ݿø��� �� : "+num);
		}
		
		
		

	}

}
