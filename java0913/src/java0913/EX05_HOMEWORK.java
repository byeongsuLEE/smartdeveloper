package java0913;

import java.util.Scanner;

public class EX05_HOMEWORK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pw = 0;
		int gw = 0;
		int mw = 0;
		int i = 1;

		System.out.print("현재 몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		gw = sc.nextInt();

		while (gw < pw) {

			System.out.print(i + "주차 감량 몸무게 : ");
			mw = sc.nextInt();

			pw -= mw;
			i++;

		}
		gw = pw;
		System.out.println(gw + "kg 달성!! 축하합니다!");

	}
}
