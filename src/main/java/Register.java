

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter Out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("psw");
		String email=request.getParameter("mail");
		String gender=request.getParameter("gender");
		long mobile_no=Long.parseLong(request.getParameter("mno"));
		String state=request.getParameter("state");
		String[] hobbies=request.getParameterValues("hobs");
		String[]qualification=request.getParameterValues("quali");
		Out.print("my name is="+name+"<br>");
		Out.print("my email is="+email+"<br>");
		Out.print("my gender is="+gender+"<br>");
		Out.print("my nmobile no is="+mobile_no+"<br>");
		Out.print("====HOBBIES ARE===<br>");
		
		for(String hobbie:hobbies)
		{
			Out.print(hobbie+"<br>");
		}
		Out.print("====QUALIFIACTION ARE===<br>");
		
		for(String qualification1: qualification)
		{
			Out.print(qualification1+"<br>");
		}
	}

}
