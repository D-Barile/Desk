package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Worker;
import service.WorkerServiceBeanLocal;

@WebServlet("/rimuovi-dipendente")
public class RemoveWorkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	WorkerServiceBeanLocal service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Worker w = service.getById(Long.parseLong(req.getParameter("id")));
		
		service.remove(w);
		
		resp.sendRedirect("http://localhost:8080/Desk/home");
	}
	
}
