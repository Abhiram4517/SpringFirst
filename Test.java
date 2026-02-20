package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.Appconfig;
import sp1.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Student st=(Student) context.getBean("Id1");
		System.out.println(st);
		

	}

}
