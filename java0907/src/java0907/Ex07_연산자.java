package java0907;

import java.util.Scanner;

public class Ex07_������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java ���� �Է�:");
		int Java=sc.nextInt();
		System.out.print("web �����Է�:");
		int Web = sc.nextInt();
		System.out.print("Android �����Է�:");
		int Android = sc.nextInt();
		System.out.println("�հ�: "+(Web+Java+Android));
		System.out.println("���: "+((Web+Java+Android)/3));
		
		
	}

}
