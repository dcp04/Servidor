package com.server;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletFormulario
 */
public class ServletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormulario() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String mail = request.getParameter("mail");
		String genero = request.getParameter("genero");
		String java = request.getParameter("java");
		String c = request.getParameter("c");
		String basic = request.getParameter("basic");
		String html = request.getParameter("html");
		String idiomas = request.getParameter("idiomas");
		String comentario = request.getParameter("comentario");
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellidos", apellidos);
		request.setAttribute("mail", mail);
		request.setAttribute("genero", genero);
		request.setAttribute("java", java);
		request.setAttribute("c", c);
		request.setAttribute("basic", basic);		
		request.setAttribute("html", html);
		request.setAttribute("idiomas", idiomas);		
		request.setAttribute("comentario", comentario);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Valores.jsp");

		dispatcher.forward(request, response);

	}

}
