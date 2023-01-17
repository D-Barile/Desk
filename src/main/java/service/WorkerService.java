package service;

import java.util.List;

import beans.Worker;

public interface WorkerService {
	
	public List<Worker> getAll();
	public void insert(Worker w);
    
}
