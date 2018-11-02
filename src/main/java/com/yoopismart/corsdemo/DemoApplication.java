package com.yoopismart.corsdemo;

import com.yoopismart.corsdemo.dao.UserRepository;
import com.yoopismart.corsdemo.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		userRepository.save(new User("Youssef", "AIT ALI", "youssef.aitali@outlook.com"));
		userRepository.save(new User("Amina", "BEN JELLOUNE", "amina.benjelloune@outlook.com"));
		userRepository.save(new User("Anas", "HMADI", "anas.hmadi@gmail.com"));

		userRepository.findAll().forEach(u -> {
			System.out.println(u);
		});

	}
}
