package service;

import java.util.List;

import beans.Desk;

public interface DeskService {
	
	public List<Desk> getAll();
	public void insert(Desk d);
	public Desk getById(Long id);
	public void remove(Desk d);
	public Desk update(Desk d);

}
