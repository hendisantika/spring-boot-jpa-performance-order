package id.my.hendisantika.springbootjpaperformanceorder.repository;

import id.my.hendisantika.springbootjpaperformanceorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:21
 * To change this template use File | Settings | File Templates.
 */
public interface OrderJpaRepository extends JpaRepository<Order, Long> {
}
