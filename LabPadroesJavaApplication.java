package one.digitalinnovation.labpadroesjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesJavaApplication.class, args);
	}

}
