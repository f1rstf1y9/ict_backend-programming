package kr.ac.cu.gbict.bknd_class_06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BkndClass06Application {

	public static void main(String[] args) {
		SpringApplication.run(BkndClass06Application.class, args);
	}

}
