package ���ǹ�;

import java.util.Scanner;

public class Ex05_����if�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int grade = sc.nextInt();
		if (grade>=90)
		{
			System.out.println("A����");
			
		}
		else if (grade>=80)
		{
			System.out.println("B����");
			
		}
		
		
		else if (grade>=70)
		{
			System.out.println("C����");
			
		}
		else
		{
	
			System.out.println("����� ��������");
		
			
		}
		

	}

}
