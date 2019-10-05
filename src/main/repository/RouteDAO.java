package main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import main.model.Route;

public interface RouteDAO extends JpaRepository<Route, Long>{

}
