package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02
 */
@WebServlet("/Ex02")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//서버프로그램은 알고리즘 사용안한다. 
		
		// 요청하는 client 의 ip주소 확인
		// ip는 어디사는지를 알 수 있다.
		// request에 클라이언트정보가 담겨있다.
		String ip = request.getRemoteAddr();
		System.out.println("접속한 사람 ip : "+ ip);
		
		//response. setCharacterEncoding()
		// html 문서를 응답할떄 문자 인코딩을 설정하는 메소드
		response.setCharacterEncoding("EUC-KR");
		
		// PrintWriter : servlet이 html 문서를 응답할떄 
		// html 문서 안에다가 태그 및 글자를 작성할 수 있는 객체
		// 객체를 사용하기 위해 객체를만들어야되는데
		// 응답에 응답객체

		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		if(ip.equals("121.147.0.243"))
		{
			out.print("<h1> 현우형의 홈파이지 </h1>");
			//servet은 html 문서를 webapp에 만들어낸다
			//따라서 이미지 위치를 webapp 이랑 같게된다.
			out.print("<img src='img4.jpg'>");
		}
		else if (ip.equals("211.228.61.212"))
		{
			out.print("<h1> 진욱쌍 홈파이지 </h1>");
			//servet은 html 문서를 webapp에 만들어낸다
			//따라서 이미지 위치를 webapp 이랑 같게된다.
			out.print("<img src='img4.jpg'>");
		}
		
		else if (ip.equals("59.0.129.84"))
		{
			out.print("<h1> 선생님 햄버거치킨피자 사주세요  </h1>");
			//servet은 html 문서를 webapp에 만들어낸다
			//따라서 이미지 위치를 webapp 이랑 같게된다.
			out.print("<img src='img4.jpg'>");
		}
		

		out.print("</body>");
		out.print("</html>");
	}

}
