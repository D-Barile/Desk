package servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Desk;
import beans.Worker;
import service.DeskServiceBeanLocal;
import service.WorkerServiceBeanLocal;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	WorkerServiceBeanLocal serviceW;
	@EJB
	DeskServiceBeanLocal serviceD;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Worker> workers = serviceW.getAll();
		List<Desk> desks = serviceD.getAll();
		req.setAttribute("desks", desks);
		req.setAttribute("workers", workers);
		req.getRequestDispatcher("index.jsp").include(req, resp);
	}
	
}
