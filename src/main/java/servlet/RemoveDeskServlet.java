package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Desk;
import service.DeskServiceBeanLocal;


@WebServlet("/rimuovi-scrivania")
public class RemoveDeskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	DeskServiceBeanLocal service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Desk d = service.getById(Long.parseLong(req.getParameter("id")));
		
		service.remove(d);
		
		resp.sendRedirect("http://localhost:8080/Desk/home");
	}

}
