package cl.awakelab.mod5.backend.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ch.qos.logback.core.db.DriverManagerConnectionSource;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("cl.awakelab.mod5.backend")
public class AppConfig {

	@Autowired
	Environment enviroment;

	@Bean
	DataSource dataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName(enviroment.getProperty("driver"));
		driverManagerDataSource.setUsername(enviroment.getProperty("username"));
		driverManagerDataSource.setPassword(enviroment.getProperty("password"));
		driverManagerDataSource.setUrl(enviroment.getProperty("url"));

		return driverManagerDataSource;
	}

}
