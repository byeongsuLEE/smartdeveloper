package java0907;

import java.util.Scanner;

public class Ex07_연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력:");
		int Java=sc.nextInt();
		System.out.print("web 점수입력:");
		int Web = sc.nextInt();
		System.out.print("Android 점수입력:");
		int Android = sc.nextInt();
		System.out.println("합계: "+(Web+Java+Android));
		System.out.println("평균: "+((Web+Java+Android)/3));
		
		
	}

}
