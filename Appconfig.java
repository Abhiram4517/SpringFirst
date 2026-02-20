package in.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp1.Student;

@Configuration
public class Appconfig {
@Bean	
public Student Id1() {
		Student st=new Student();
		st.setEid(1);
		st.setName("Abhiram");
		st.setSal(10000);
		return st;
	
	}

}
