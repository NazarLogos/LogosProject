package homework_17.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import homework_17.service.UnivercityService;
@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);

		Univercity univercity = new Univercity();
		univercity.setAddressOfTheUnivercity("Street");
		univercity.setAmountOfStudent(23);
		univercity.setAmountOfUnivercity(43);
		univercity.setLevelOfAccreditation("Hight");
		univercity.setName("Nafta");
		service.save(univercity);
		
	}

}
