package br.com.cti.First.Project;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
			Pattern pattern = Pattern.compile("\\{\"ISBN:\\d+\":\\s*?([\\s\\S]*)");
			Matcher matcher = pattern.matcher(jsonLivro);
			if (matcher.find()) {
				jsonLivro = matcher.group(1);
			}
			var converterDados = new ConverteDados();

			var dadosLivros = converterDados.obterDados(jsonLivro, DadosLivros.class);
			System.out.println("Dados Livros: " + dadosLivros);
			System.out.println("Dados Livros Title: " + dadosLivros.title());
			System.out.println("Dados Livros Authors: " + dadosLivros.authors());
			System.out.println("Dados Livros Number of Pages: " + dadosLivros.numberOfPages());
			System.out.println("Dados Livros Identifiers: " + dadosLivros.identifiers());
			System.out.println("Dados Livros Classifications: " + dadosLivros.classifications());
			System.out.println("Dados Livros Publishers: " + dadosLivros.publishers());
			System.out.println("Dados Livros Publish Date: " + dadosLivros.publishDate());
			System.out.println("Dados Livros Subjects: " + dadosLivros.subjects());
			System.out.println("Dados Livros Cover: " + dadosLivros.cover());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
