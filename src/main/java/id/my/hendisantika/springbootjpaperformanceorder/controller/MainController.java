package id.my.hendisantika.springbootjpaperformanceorder.controller;

import id.my.hendisantika.springbootjpaperformanceorder.repository.OrderJpaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:23
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
class MainController {

    private final OrderJpaRepository orderRepository;

    @PersistenceContext
    private EntityManager em;
}
