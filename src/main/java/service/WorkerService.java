package service;

import java.util.List;

import beans.Worker;

public interface WorkerService {
	
	public List<Worker> getAll();
	public void insert(Worker w);
	public Worker getById(Long id);
	public void remove(Worker w);
	public Worker update(Worker w);
    
}
