package java0907;

public class Ex03_형변환 {

	public static void main(String[] args) {
		//형변환 : 데이터의 형태를 다른 형태로 저장하는 기법!
		//실수형 2.1 -> 정수형
		//정수형 1-> 실수형 1.0
		// TODO Auto-generated method stub
		int a =3 ;
		float c = a ;  // 자동형변환이다.
		a= (int)c;
		
		String b = "abac";
		System.out.println(b+c);
		
		
		String f = 10+ 7 + "";
		String d = 8 + ""+ 2 ;
		String u = ""+5+2;

	}

}
