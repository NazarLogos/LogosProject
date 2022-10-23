package homework_16.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		StudentDaoImpl sdi = (StudentDaoImpl) ctx.getBean("studentDaoImpl");
		System.out.println(	sdi.readAll());

	}
}
