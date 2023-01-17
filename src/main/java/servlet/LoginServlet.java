package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String USER = "prova";
	private final String PASS = "prova";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String paramUser = req.getParameter("user");
		String paramPass = req.getParameter("pass");
		
		if(USER.equals(paramUser) && PASS.equals(paramPass)) {
			HttpSession oldSession = req.getSession(false);
			if(oldSession != null) {
				oldSession.invalidate();
			}
			HttpSession currentSession = req.getSession();
			currentSession.setAttribute("user", paramUser);
			currentSession.setMaxInactiveInterval(5);
			resp.sendRedirect("index.jsp");
		}else {
			resp.sendRedirect("login.jsp");
		}
	}

}