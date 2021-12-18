package ma.ensias.adservice.adservice;

import ma.ensias.adservice.adservice.entity.Ad;
import ma.ensias.adservice.adservice.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdServiceApplication implements CommandLineRunner {

	@Autowired
	AdRepository adRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdServiceApplication.class, args);
	}

	@Override
	public void run(String... strings){
		Ad ad1 = new Ad(1L, "11 Go d'internet 4G + 1h d'appels\n" +
				"+ 25 SMS nationaux pour seulement 999999 dhs");
		Ad ad2 = new Ad(2L, "Envoyez DREAM au 1337 par sms pour gagner une bicyclette");
		adRepository.save(ad1);
		adRepository.save(ad2);
	}
}
