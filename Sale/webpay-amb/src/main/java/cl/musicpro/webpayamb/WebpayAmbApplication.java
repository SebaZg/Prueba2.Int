package cl.musicpro.webpayamb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WebpayAmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebpayAmbApplication.class, args);
	}

}
