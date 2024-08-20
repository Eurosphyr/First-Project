package br.com.cti.First.Project;

// import java.util.ArrayList;
// import java.util.List;

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
		try {
			var consumirApi = new ConsumirApi();
			var jsonLivro = consumirApi.obterDados("https://openlibrary.org/api/books?bibkeys=ISBN:9780134685991&format=json&jscmd=data");
			System.out.println("Raw JSON Livro: " + jsonLivro);
			System.out.println("Raw JSON Livro Length: " + jsonLivro.length());
		
			var converterDados = new ConverteDados();
			var dadosLivros = converterDados.obterDados(jsonLivro, DadosLivros.class);
			System.out.println("Dados Livros: " + dadosLivros);
			
			// Check if map is empty
			if (dadosLivros.getBooks().isEmpty()) {
				System.out.println("No books found in DadosLivros");
			} else {
				dadosLivros.getBooks().forEach((key, book) -> System.out.println("Book Key: " + key + ", Book: " + book));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
