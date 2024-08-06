package br.com.cti.First.Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cti.First.Project.model.ConverteDados;
import br.com.cti.First.Project.model.DadosLivros;
import br.com.cti.First.Project.service.ConsumirApi;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumirApi = new ConsumirApi();
		var jsonLivro = consumirApi.obterDados("https://openlibrary.org/api/books?bibkeys=ISBN:9780134685991&format=json&jscmd=data");
		System.out.println(jsonLivro);

		var converterDados = new ConverteDados();
		var dadosLivros = converterDados.obterDados(jsonLivro, DadosLivros.class);
		System.out.println(dadosLivros);
}
}
