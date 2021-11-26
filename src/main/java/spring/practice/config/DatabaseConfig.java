package spring.practice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableJpaRepositories("spring.practice.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("spring.practice")
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        return null;
    }
}
