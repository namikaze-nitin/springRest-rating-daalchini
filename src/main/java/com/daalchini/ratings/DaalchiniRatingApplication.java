package com.daalchini.ratings;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages="com")
public class DaalchiniRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaalchiniRatingApplication.class, args);
	}
	
	@Bean
	@SuppressWarnings("deprecation")
	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
	    HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
	    fact.setEntityManagerFactory(emf);
	    return fact;
	}
}
