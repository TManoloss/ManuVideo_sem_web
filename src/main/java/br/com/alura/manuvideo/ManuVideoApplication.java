package br.com.alura.manuvideo;

import br.com.alura.manuvideo.model.DadosSerie;
import br.com.alura.manuvideo.service.ConsumoApi;
import br.com.alura.manuvideo.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManuVideoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManuVideoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var  json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=473b6e98");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json , DadosSerie.class);
		System.out.println(dados);
	}
}
