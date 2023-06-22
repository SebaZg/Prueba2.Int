package cl.musicpro.svc_service_sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SvcServiceSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcServiceSaleApplication.class, args);
	}

}
