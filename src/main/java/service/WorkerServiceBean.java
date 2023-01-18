package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import beans.Worker;

@Stateless
public class WorkerServiceBean implements WorkerServiceBeanLocal, WorkerServiceBeanRemote {

	@PersistenceContext(unitName = "desk")
	EntityManager manager;
	
    public WorkerServiceBean() {

    }
    
    public List<Worker> getAll() {
    	return manager.createQuery("SELECT w FROM Worker w", Worker.class).getResultList();
    }
    
    public void insert(Worker w) {
    	manager.persist(w);
    }

	@Override
	public Worker getById(Long id) {
		return manager.find(Worker.class, id);
	}

	@Override
	public void remove(Worker w) {
		manager.remove(manager.merge(w));
	}

	@Override
	public Worker update(Worker w) {
		return manager.merge(w);
	}
    
}
