package springexample;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String args[])
	{
		XmlBeanFactory fac = new XmlBeanFactory (new ClassPathResource("file:Springexample/src/springexample/Beans.xml"));
	HelloWorld obj = (HelloWorld) fac.getBean("helloworld");
	obj.getMessage();
	}
}
