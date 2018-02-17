package com.unbosque.progII.servlet.autenticacion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/servletLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioServlet = request.getParameter("txtUsuario");
		String contrasenaServlet = request.getParameter("passContrasena");
		
		if(usuarioServlet.equals("admin") && contrasenaServlet.equals("12345")) {
			PrintWriter pw = response.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("	<body>");
			pw.println("		<label style='color:blue'>Autenticaci�n exitosa</label>");
			pw.println("	</body>");
			pw.println("</html>");
			pw.flush();
			pw.close();
			
		}else {
			PrintWriter pw = response.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("	<body>");
			pw.println("		<label style='color:red'>Autenticaci�n Fallida</label>");
			pw.println("	</body>");
			pw.println("</html>");
			pw.flush();
			pw.close();			
		}
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
