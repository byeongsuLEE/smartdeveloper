package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02URLMapping
 */
@WebServlet("/Ex02URLMapping")
public class Ex02URLMapping extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//URL MAPPING : WEB Browser 에서 Servlet 을 동작하기 위해 url 값을 연결시키는것
		// 수정이  가능하다 보니 특징 2가지
		// 1. 긴 url을 단축시킬수있다.
		// 2. 그대로 쓰면 class명을 노출시킬기 떄문에 보완상의 문제를 해결할 수 있다.
		
		int i = 3; int k = 1;  
	      

        switch(i) {  
    

          case 1: k += 1; 
    

          case 2: k++; 
    

          case 3: k = 0;  
    

          

        } 
    

        System.out.print(k);
	}

}
