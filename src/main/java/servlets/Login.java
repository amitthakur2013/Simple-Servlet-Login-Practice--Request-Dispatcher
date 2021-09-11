package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		String n=req.getParameter("username");
		String p=req.getParameter("userpass");
		
		if(p.equals("servlet")) {
			RequestDispatcher rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
			
		} else {
			writer.print("Sorry! Username or Password Error!!");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
}
