package id.my.hendisantika.springbootjpaperformanceorder.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:22
 * To change this template use File | Settings | File Templates.
 */
@Component
class DataInitializer implements CommandLineRunner {

    @PersistenceContext
    private EntityManager em;

}
