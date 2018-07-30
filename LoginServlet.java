import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		out.println("name: "+un);
		out.println("password: "+pw);
	}
}