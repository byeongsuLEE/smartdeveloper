package java0913;

import java.util.Scanner;

public class Ex01_while1 {
	public static void main(String[] args) {
		// ����1
		// while���� ����Ͽ� Ű����κ��� �Է¹��� ���� 10���� �������� ��� �Է¹�������
//		//�ذ��1
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int a=sc.nextInt();
//		
//		while(a<10)
//		{
//			System.out.print("���� �Է� : " );
//			a = sc.nextInt();
//			
//			
//			
//		}
//		System.out.println("����Ǿ����ϴ�.");
//		
//		
//	
		//�ذ�� 2
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (true) {
			System.out.print("���� �Է� : ");
			a= sc.nextInt();
			
			if (a >=10 ) 
			{
				
				
				break;
			}

		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
