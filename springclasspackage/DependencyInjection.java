package springclasspackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DependencyInjection {

	public static void main(String[] args) {
		//Resource r =new ClassPathResource("springclasspackage/springconfig.xml");
		ClassPathResource r = new ClassPathResource("springclasspackage/springconfig.xml");
		BeanFactory b= new XmlBeanFactory(r);
		
		//ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springclasspackage/springconfig.xml");

	}

}
