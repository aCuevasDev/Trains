package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Town;
import main.repository.TownDAO;

@Service
public class TownService {
	
	@Autowired private TownDAO townDAO;
	
	public List<Town> findTowns(){
		return townDAO.findAll();
	}

}
