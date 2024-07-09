package springclasspackage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MyFirstSpring {

	public static void main(String[] args) {
		Resource r =new ClassPathResource("springclasspackage/springconfig.xml");
		BeanFactory b= new XmlBeanFactory(r);
		
		ApplicationContext b=new ClassPathXmlApplicationContext("springclasspackage/springconfig.xml");
		Book book=(Book)b.getBean("s1");
		
		System.out.println("Book Id : "+book.getBook_id());
		System.out.println("Book Name : "+book.getBook_name());
		System.out.println("Author : "+book.getAuthor());	
		
		ClassPathXmlApplicationContext b1=new ClassPathXmlApplicationContext("springclasspackage/springconfig.xml");
		Book book1=(Book)b1.getBean("s1");
		
		System.out.println("Book Id : "+book1.getBook_id());
		System.out.println("Book Name : "+book1.getBook_name());
		System.out.println("Author : "+book1.getAuthor());

		
	}

}
