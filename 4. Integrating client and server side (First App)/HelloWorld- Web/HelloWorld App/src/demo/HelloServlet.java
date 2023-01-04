

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String i = req.getParameter("name1");
		String j = req.getParameter("name2");
		
		String k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("Hello World"+ k);
	}

}
