package id.my.hendisantika.springbootjpaperformanceorder.controller;

import id.my.hendisantika.springbootjpaperformanceorder.repository.OrderJpaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/api/v1/orders")
    public List<OrderResponse> ordersV1() {
        return orderRepository.findAll()
                .stream()
                .map(this::transform)
                .toList();
    }

}
