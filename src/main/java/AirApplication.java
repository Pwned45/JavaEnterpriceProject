
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
		basePackageClasses = {
				ApplicationConfig.class,
				//SimulationService.class
		})
public class AirApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AirApplication.class);
//		SimulationService simulationService = context.getBean(AirApplication.class);
//		simulationService.start();
	}
}
