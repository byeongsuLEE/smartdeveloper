package ���ǹ�;

import java.util.Scanner;

public class Ex09_switch��3 {

	public static void main(String[] args) {
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

		switch (result) {
		case "����":
		case "�ָ��ָ�":
		case "��������":
			System.out.println("���º�");
			break;

		case "������":
		case "�ָ԰���":
		case "���ָ�":
			System.out.println(user1 + "���� �̰��");
			break;
		case "������":
		case "�ָԺ�":
		case "�����ָ�":
			System.out.println(user1 + "���� ����");
			break;
		default:
			break;

		}

	}

}
