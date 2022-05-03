package com.staff;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/StaffInsert")
public class StaffInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ID = request.getParameter("id");
		String name = request.getParameter("name");
		String academic = request.getParameter("aq");
		String subject = request.getParameter("subject");
		String email = request.getParameter("email");
		String number = request.getParameter("phone");
		String dateofBirth = request.getParameter("date");
		String gender = request.getParameter("gender");
		boolean isTrue;
		
		isTrue = StaffDBUtil.insertStaff(ID, name, academic, subject, email, number, dateofBirth, gender);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Success.jsp");
			dis.forward(request, response);
			
		} else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
