package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String userName = req.getParameter("username");		
		
		resp.getWriter().println("Welcome " + userName + "!!");	
	}
}