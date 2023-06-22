package cl.musicpro.bff_service_sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffServiceSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffServiceSaleApplication.class, args);
	}

}
