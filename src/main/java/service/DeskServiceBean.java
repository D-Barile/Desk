package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import beans.Desk;

@Stateless
public class DeskServiceBean implements DeskServiceBeanRemote, DeskServiceBeanLocal {

	@PersistenceContext(unitName = "desk")
	EntityManager manager;
	
    public DeskServiceBean() {

    }

	@Override
	public List<Desk> getAll() {
		return manager.createQuery("SELECT d FROM Desk d", Desk.class).getResultList();
	}

	@Override
	public void insert(Desk d) {
		manager.persist(d);
		
	}

	@Override
	public Desk getById(Long id) {
		return manager.find(Desk.class, id);
	}

	@Override
	public void remove(Desk d) {
		manager.remove(manager.merge(d));
	}

	@Override
	public Desk update(Desk d) {
		return manager.merge(d);
	}

}
