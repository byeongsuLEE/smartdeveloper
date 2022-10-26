
package java0907;

import java.util.Scanner;

public class Ex06_입력실습 {
	public static void main(String[] args) {
		//마우스와 키보드로 입력
		//키보드 입력니으 불러오기! -> import 과정필요
		Scanner sc = new Scanner(System.in);
		//입력할때 안내문구만들기
		System.out.print("숫자를 입력하세요 >> ");
		String a = sc.next();
		System.out.println("입력된 이름은:"+ a);
		
		
	}
	
		
	
	
}
