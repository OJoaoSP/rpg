package rpg.api;

import org.flywaydb.core.internal.util.JsonUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rpg.api.models.Status;

@SpringBootApplication
public class RpgApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgApplication.class, args);
	}
}
