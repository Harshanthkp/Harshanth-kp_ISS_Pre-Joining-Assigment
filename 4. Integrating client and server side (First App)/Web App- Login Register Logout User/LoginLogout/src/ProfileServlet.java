import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("Login_Logout_link.html").include(request, response);
		Cookie ck[] = request.getCookies();
		if (ck != null) {
			String name = ck[0].getValue();
			if (!name.equals("") || name != null) {
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, " + name);
			} else {
				out.print("Please login first");
				request.getRequestDispatcher("Login.html").include(request, response);
			}
			out.close();
		}
	}
}