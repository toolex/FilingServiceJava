package com.codeclan.example.Filingservice;

import com.codeclan.example.Filingservice.models.File;
import com.codeclan.example.Filingservice.models.Folder;
import com.codeclan.example.Filingservice.models.User;
import com.codeclan.example.Filingservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilingserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserFileFolder(){
		User user = new User("Bob");
		userRepository.save(user);

		Folder folder = new Folder("Bobs stuff", user);
		File file = new File("Picture", ".png", 20, folder);
	}
}
