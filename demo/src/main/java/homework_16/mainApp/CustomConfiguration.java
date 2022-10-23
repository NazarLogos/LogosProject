package homework_16.mainApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("homework_16.configuration")
public class CustomConfiguration {


	@Bean(name = "studentDaoImpl")
	public StudentDaoImpl getStudentDaoImpl() {
		return new StudentDaoImpl();
	}

}
