package ���ǹ�;

import java.util.Scanner;

public class Ex10_switch_����if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("user1 : ");
		String user1 = sc.next();
		System.out.println("user2 : ");

		String user2 = sc.next();
		System.out.println(user1 + " >>");

		String result1 = sc.next();
		System.out.println(user2 + " >>");
		String result2 = sc.next();
		String result = result1 + result2;
		
		//���ڿ��� ���ڿ��� �����ִ� �Լ�-> ��.equals.(���� ��)
		if (result=="����"||result==("�ָ��ָ�")||result==("��������"))
		{
			System.out.println("���º��Դϴ�");
			
		}
		else if(result==("���ָ�")||result==("������")||result==("�ָ԰���"))
		{
			System.out.println(user1+"���� �̰���ϴ�.");
					
		}
		else if(result==("������")||result==("�����ָ�")||result==("�ָԺ�"))
		{
			System.out.println(user1+"���� �����ϴ�.");
			
			
		}
		else
		{
			System.out.println("���� �Դϴ�~");
		}
	}

}
