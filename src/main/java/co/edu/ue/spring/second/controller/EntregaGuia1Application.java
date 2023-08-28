package co.edu.ue.spring.second.controller;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue.spring.second.controller"})
public class EntregaGuia1Application {

	public static void main(String[] args) {
		SpringApplication.run(EntregaGuia1Application.class, args);
	}
	
}
