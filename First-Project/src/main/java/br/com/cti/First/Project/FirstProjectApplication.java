package br.com.cti.First.Project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cti.First.Project.model.ConverteDados;
import br.com.cti.First.Project.model.DadosSerie;
import br.com.cti.First.Project.service.ConsumirApi;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumirApi = new ConsumirApi();
		 var json = consumirApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		 System.out.println(json);
		 json = consumirApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		 ConverteDados converterDados = new ConverteDados();
		 DadosSerie dados = converterDados.obterDados(json, DadosSerie.class);
		 System.out.println(dados);

		 
	}

}
