package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import main.controller.TrainController;

/**
 * Springboot application bootstrap
 * @author Alex
 *
 */
@SpringBootApplication
@EnableJpaRepositories("main.repository")
@PropertySource("config/application.properties")
public class Application implements CommandLineRunner{
	
	@Autowired TrainController controller;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------------------------");
		controller.main(args);
	}

}