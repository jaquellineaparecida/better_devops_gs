package com.example.gs_ursa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GsRunner implements CommandLineRunner{

	  @Override
	   public void run(String... args) throws Exception {
	       // Lógica executada ao iniciar a aplicação
	       System.out.println("Aplicação iniciada com sucesso!");
	   }
}
