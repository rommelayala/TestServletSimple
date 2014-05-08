package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSimple
 */
@WebServlet("/ServletSimple")
public class ServletSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSimple() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD>");
		out.println("<TITLE>Hola</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("Hola!");
		out.println("<BR>");
		String opcion=request.getParameter("opcion");
		out.println("El User ha escogido el valor -> " + opcion);
		out.println("</BR>");
		out.println("</BODY>");
		
		out.close();
	}

}
