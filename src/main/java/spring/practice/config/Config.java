package spring.practice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import spring.practice.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;

@Configuration
@ComponentScan("spring.practice")
@PropertySource("${classpath:app.properties}")
@EnableTransactionManagement(proxyTargetClass = true)

public class Config {

    @Value("${persistance.Car}")
    private String persistanceUnit;

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
    public EntityManagerFactory entityManagerFactory(Properties hibernateProperties) {
        return Persistence.createEntityManagerFactory(persistanceUnit, hibernateProperties);
    }

    @Bean
    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.createEntityManager();
    }

    @Bean(name = "fiat")
    public Car car(@Value("${car.Fiat}") String model, @Value("1995") int year, @Value("brown") String color){
        return new Car(model, year, color);
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }
}
