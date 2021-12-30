package knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main ( String[] args ) throws Exception {
		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		contextXml.refresh();
		
		AnnotationConfigApplicationContext contextAnnotation = new AnnotationConfigApplicationContext("fr.nnyimc.config.KnightConfig.class");
		contextAnnotation.refresh();
		
		Knight knightXml = contextXml.getBean(Knight.class);
		knightXml.embarkOnQuest();
		
		Knight knightAnnotation = contextAnnotation.getBean(Knight.class);
		knightAnnotation.embarkOnQuest();
		
		contextXml.close();
		contextAnnotation.close();
	}
}
