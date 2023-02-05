package org.oddodan.nations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class NationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NationsApplication.class, args);
	}

}
