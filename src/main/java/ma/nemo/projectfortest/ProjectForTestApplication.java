package ma.nemo.projectfortest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProjectForTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectForTestApplication.class, args);
		log.error("hello world form the test project");
	}

}
