package ch.vinicius.musiclibrary.musiclib.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.vinicius.musiclibrary.musiclib.repository.Repository;

@Component
public class Initializer implements ApplicationRunner {

	@Autowired
	Repository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.saveUser("Vinicius", "Initializer");
	}

}
