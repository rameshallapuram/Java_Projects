package SpringProject.Demo1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/SpringProject/Demo1/collections/collectionConfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());
	}
}
