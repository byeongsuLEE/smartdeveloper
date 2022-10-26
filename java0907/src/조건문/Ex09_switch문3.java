package 조건문;

import java.util.Scanner;

public class Ex09_switch문3 {

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
		case "보보":
		case "주먹주먹":
		case "가위가위":
			System.out.println("무승부");
			break;

		case "가위보":
		case "주먹가위":
		case "보주먹":
			System.out.println(user1 + "님이 이겼다");
			break;
		case "보가위":
		case "주먹보":
		case "가위주먹":
			System.out.println(user1 + "님이 졌다");
			break;
		default:
			break;

		}

	}

}
