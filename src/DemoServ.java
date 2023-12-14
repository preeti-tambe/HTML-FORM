import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServ  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		System.out.println("hello world");
		PrintWriter p =resp.getWriter();
		p.print("hello world");
		String name=req.getParameter("uname");
		
		p.print("welcome<b> "+name+"</b>");
		
		
		
	}
	
	
	
	
	
	
	

}
