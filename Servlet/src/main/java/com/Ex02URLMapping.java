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
		
		//URL MAPPING : WEB Browser ���� Servlet �� �����ϱ� ���� url ���� �����Ű�°�
		// ������  �����ϴ� ���� Ư¡ 2����
		// 1. �� url�� �����ų���ִ�.
		// 2. �״�� ���� class���� �����ų�� ������ ���ϻ��� ������ �ذ��� �� �ִ�.
		
		int i = 3; int k = 1;  
	      

        switch(i) {  
    

          case 1: k += 1; 
    

          case 2: k++; 
    

          case 3: k = 0;  
    

          

        } 
    

        System.out.print(k);
	}

}
