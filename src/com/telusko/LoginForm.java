package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		// (random true or false, 1 for true, 2 for false)
		Random random = new Random();
		int correctPassword = random.nextInt(2);

		// Using request dispatcher because it's within the same server
		RequestDispatcher dispatcher;

		if (correctPassword == 1) {
			dispatcher = req.getRequestDispatcher("Welcome");

		} else {
			dispatcher = req.getRequestDispatcher("WrongPassword");
		}
		dispatcher.forward(req, resp);

	}
}