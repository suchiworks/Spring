package com.example.entity;
//injection
	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	import com.Spring.Lab.entity.College;


	public class college {
		public static void main(String[] args) {
			Resource res=new ClassPathResource("ApplicationContext1.xml");
			BeanFactory b=new XmlBeanFactory(res);
			College cn=(College) b.getBean("cin");
			college.display();
		}
	}

