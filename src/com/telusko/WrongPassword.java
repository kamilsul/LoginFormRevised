package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WrongPassword")
public class WrongPassword extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().println("Get Lost");	
	}
}