package ���ǹ�;

import java.util.Scanner;

public class Ex11 {

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

		if (result1.equals(result2)) {
			System.out.println("���º��Դϴ�.");

		}

		else if (result1.equals("����")) {
			if (result2.equals("����")) {
				System.out.println(user1 + "���� ����.");

			} else {
				System.out.println(user1 + "���� �̰��.");
			}

		} else if (result1.equals("����")) {
			if (result2.equals("����"))
			{
				System.out.println(user1+"���� �̰���ϴ�");

			}
			else
				System.out.println(user1+"���� ���̽��ϴ�.");
		} else if (result1.equals("��"))

		{
			if (result2.equals("����")) {
				System.out.println(user1 + "���� �¸��ϼ̽��ϴ�.");
			} else {
				System.out.println(user1 + "���� �й��ϼ̽��ϴ�.");
			}
		}
	}

}
