package cn.edu.scau.pl.java.test.client;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.pl.java.test.domain.Student;
import cn.edu.scau.pl.java.test.domain.Teacher;

public class SpringClient {

	private final static Log logger = LogFactory.getLog(Student.class);
	
	 public static void main(String args[]) {
		 
		 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Teacher student = (Teacher)ac.getBean("teacher");
		 System.out.println(student.toString());
		 logger.info(student);
		 
	 }
	 
}
