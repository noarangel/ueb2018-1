package com.unbosque.progII.servlet.calcular;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FechaServlet
 */
@WebServlet("/FechaServlet")
public class FechaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FechaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		pw.println("<html>");
		pw.println("	<body>");
		pw.println("		<form method=\"post\" action=\"/mptw/FechaServlet\">");
		pw.println("		<form method=\"post\" action=\"/mptw/FechaServlet\">");
		pw.println("			<div Align=\"center\">");
		pw.println("				<h1>Ingrese su fecha de nacimiento</h1>");
		pw.println("				<div Align=\"center\">");
		pw.println("					<table>");
		pw.println("						<tr>");
		pw.println("							<td>");
		pw.println("								<label>Fecha</label>");
		pw.println("							</td>");
		pw.println("							<td>");
		pw.println("								<input type=\"date\" id=\"fecha\"/>");
		pw.println("							</td>");
		pw.println("	</body>");
		pw.println("</html>");
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	}

}
