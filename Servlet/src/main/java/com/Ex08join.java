package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08join
 */
@WebServlet("/Ex08join")
public class Ex08join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//form 태그로부터 post 방식으로 데이터 받아오기
		
		//id:~~
		// :~~~
		// 이런식으로 응답 페이지에 출력시켜보기
		//select
		
	
		request.setCharacterEncoding("EUC-KR");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String birthday = request.getParameter("date");
		String color = request.getParameter("color");
		String country = request.getParameter("select");
		String text = request.getParameter("text");

		// 문서인데 html를 따르는 문서고 encoding 방식은 euc-kr이다. 라고 인코딩
		response.setContentType("text/html; charset=EUC-KR");
		//응답하겠다 
		PrintWriter out = response.getWriter();
		out.println("ID : "+ id);
		out.print("<br>");
		out.println("NAME : "+ name);
		out.print("<br>");
		out.println("EMAIL : "+email );
		out.print("<br>");
		out.println("TEL : "+tel );
		out.print("<br>");
		out.println("GENDER : "+gender );
		out.print("<br>");
		out.println("HOBBY : "+ Arrays.toString(hobby));
		out.print("<br>");
		out.println("BIRTHDAY : "+ birthday);
		out.print("<br>");
		out.println("COLOR : "+ color);
		out.print("<br>");
		out.println("COUNTRY : "+ country);
		out.print("<br>");
		out.println("TALK : "+ text);
		
		
	}

}
