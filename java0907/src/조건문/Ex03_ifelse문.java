package ���ǹ�;

import java.util.Scanner;

public class Ex03_ifelse�� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ����:");
		int num = sc.nextInt();
		
//		System.out.println(num%2==0?"10�� ¦���Դϴ�.":"Ȧ����(��) ¦���Դϴ�.");
		if (num%2==0)
		{
			System.out.println(num + "�� ¦���Դϴ�.");
		}
		else
		{
			System.out.println(num + "�� Ȧ���Դϴ�.");

		}
		
	}

}
