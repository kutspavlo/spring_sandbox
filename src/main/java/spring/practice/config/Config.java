package spring.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;

@Configuration
@ComponentScan("spring.practice")
public class Config {

    @Bean
    public Properties hibernateProperties() {
        final Properties properties = new Properties();

        properties.put("javax.persistence.jdbc.drive", "org.postgresql.Driver");
        properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost:5433/first_db");
        properties.put("javax.persistence.jdbc.user", "postgres");
        properties.put("javax.persistence.jdbc.password", "rewfds");
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("show_sql", "true");
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.use_sql_comments", "true");

        return properties;
    }

    @Bean
    public EntityManager entityManager(Properties hibernateProperties) {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Car", hibernateProperties);
        return entityManagerFactory.createEntityManager();
    }
}
