package com;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MarketAddItem
 */
@WebServlet("/MarketAddItem")
public class MarketAddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//문제
		// maket.jsp에서 선택한 상품만큼 쿠키를 생성해서 client 에게 저장하시오
		// 주의할점
		// 동일한쿠키이름으로 게속생성하면 마지막 값만 저장이 되니
		// 쿠키의 이름은 선택한 상품만큼 달라지면서 저장되어야한다.
		request.setCharacterEncoding("EUC-KR");
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			
		
		for (int i = 0 ; i <cookies.length;i++)
		{
			if(!cookies[i].getName().equals("JSESSIONID")) {
				Cookie cookie =new Cookie("goods"+i,cookies[i].getValue());
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				
			}
				
		}
		}
		
		String []x =request.getParameterValues("goods");
		
		response.setContentType("text/html; charset=EUC-KR");
		if(x!=null) {
		for(int i = 0 ; i<x.length;i++)
		{
			
			Cookie cookie =new Cookie("goods"+i,x[i]);
			response.addCookie(cookie);
			
		}
		}
		

		response.sendRedirect("market.jsp");
	}

}
