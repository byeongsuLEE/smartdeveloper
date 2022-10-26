package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04DataSend
 */
@WebServlet("/Ex04")
public class Ex04DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Form 태그 데이터 받아오기
		// input 태그의 data 하나 : 파라미터
		// data들이 request안에 들어있다.
		// request.getParameter("input테그의 name") : 파라미터 수집이라고한다.
		request.setCharacterEncoding("EUC-KR");
		String data = request.getParameter("data");
		System.out.println(data);
		
		//응답을 작성하기 전에도 인코딩 지정이 필요하다.
		// 인코딩 뿐만 아니라 응답해주는 내용이 어떤 형식인지 까지 지정
		//   ; 따라나눠짐
		// " 문서형식 : Charset= 인코딩 방식"
		// text/html : html형식으로 작성된문서
		
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+data+"</h1>");
		
	}

}
