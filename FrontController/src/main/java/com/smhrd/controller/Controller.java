package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 기준을 만드는 인터페이스
public interface Controller {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
