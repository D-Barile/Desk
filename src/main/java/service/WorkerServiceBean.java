package service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import beans.Worker;

@Stateless
public class WorkerServiceBean implements WorkerService {

	@PersistenceContext(unitName = "desk")
	EntityManager manager;
	
    public WorkerServiceBean() {

    }
    
    public void insert(Worker w) {
    	manager.persist(w);
    }

}
