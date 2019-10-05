package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.model.Path;

public interface PathDAO extends JpaRepository<Path, Long>{

}
