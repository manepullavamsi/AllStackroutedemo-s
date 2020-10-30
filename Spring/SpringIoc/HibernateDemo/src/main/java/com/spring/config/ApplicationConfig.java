package com.spring.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.model.Course;

@Configuration
@EnableTransactionManagement
public class ApplicationConfig {
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/CourseDB");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) throws IOException
	{
		LocalSessionFactoryBean session =new LocalSessionFactoryBean();
		session.setDataSource(dataSource);
		Properties properties=new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		session.setHibernateProperties(properties);
		session.setAnnotatedClasses(Course.class);
		session.afterPropertiesSet();
		return session;
	}
	
	@Bean
	public HibernateTransactionManager getTranscationManger(SessionFactory sessionFactory)
	{
		HibernateTransactionManager manger= new HibernateTransactionManager();
		manger.setSessionFactory(sessionFactory);
		return manger;
	}
}
 	