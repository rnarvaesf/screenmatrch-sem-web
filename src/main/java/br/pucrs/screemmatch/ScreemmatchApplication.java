package br.pucrs.screemmatch;

import br.pucrs.screemmatch.dto.SerieDto;
import br.pucrs.screemmatch.service.impl.ConvertJsonDataImpl;
import br.pucrs.screemmatch.service.impl.SeriesServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemmatchApplication implements CommandLineRunner {
	private static final String URL_SERIES = "https://www.omdbapi.com/?t=the+witcher&apikey=35aef27a";

	public static void main(String[] args)  {

		SpringApplication.run(ScreemmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var json = new SeriesServiceImpl().obterDados(URL_SERIES);
		ConvertJsonDataImpl conversor= new ConvertJsonDataImpl();

		SerieDto dto = conversor.getData(json,SerieDto.class);

		System.out.println(dto);
	}
}
