package nvc.it.ice_factory_wasok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryWasokApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryWasokApplication.class, args);
	}

}
