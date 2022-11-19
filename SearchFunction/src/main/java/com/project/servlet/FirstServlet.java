package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/staging")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    
    public FirstServlet() {
        }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String fName=(String)request.getParameter("fname");
		String password=(String)request.getParameter("pass");
		
		if(fName.matches("Developer")) {
			dispResult(fName,password,request,response);
		}else {
			PrintWriter pw=response.getWriter();
			pw.print("FirstName:"+""+fName);
			pw.print("<br>");
			pw.print("Password:"+""+password);
			request.getServletPath();
		}
				
	}
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
 		String fName=(String)request.getParameter("fname");
 		String password=(String)request.getParameter("pass");
 		/*successMessage(fName,password,request,response);*/
 		PrintWriter pw=response.getWriter();
		pw.print("FirstName:"+""+fName);
		pw.print("<br>");
		pw.print("Password:"+""+password);
		if(fName.matches("Developer")) {
			dispResult(fName,password,request,response);
		}else {
			PrintWriter pw1=response.getWriter();
			pw1.print("FirstName:"+""+fName);
			pw1.print("<br>");
			pw1.print("Password:"+""+password);
			request.getServletPath();
		}
		
	}


	/*private void successMessage(String fName, String password, HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("FirstName", fName);
		request.setAttribute("Password", password);
		RequestDispatcher rd=request.getRequestDispatcher("Post.jsp");
		rd.forward(request, response);
	} */


	private void dispResult(String fName, String password, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("FirstName", fName);
		request.setAttribute("Password", password);
		RequestDispatcher rd =request.getRequestDispatcher("View.jsp");
		
		rd.forward(request, response);
	}
	
	
	
}
