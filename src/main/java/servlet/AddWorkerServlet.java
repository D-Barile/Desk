package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Desk;
import beans.Worker;
import service.WorkerServiceBeanLocal;

@WebServlet("/aggiungi-dipendente")
public class AddWorkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	WorkerServiceBeanLocal service;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("form-add-worker.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Worker w = new Worker();
		Desk d = new Desk();
		
		w.setNome(req.getParameter("nome"));
		w.setCognome(req.getParameter("cognome"));
		w.setEta(Integer.parseInt(req.getParameter("eta")));
		w.setDescrizione(req.getParameter("descrizione"));
		
		d.setId_desk(Long.parseLong(req.getParameter("scrivania")));
		
		w.setDesk(d);
		
		service.insert(w);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
