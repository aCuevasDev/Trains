package main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import main.model.Town;

public interface TownDAO extends JpaRepository<Town, Long>{

}
