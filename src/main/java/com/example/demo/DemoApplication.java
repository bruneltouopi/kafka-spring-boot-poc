package com.example.demo;

import com.example.demo.models.Foo;
import com.example.demo.services.FooSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	private FooSender sender;

	@Override
	public void run(String... strings) throws Exception {
		Foo foo = new Foo("Spring Kafka", "sending and receiving JSON messages");
		sender.send(foo);
	}

}
