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

    @GetMapping("/api/v2/orders")
    public List<OrderResponse> ordersV2() {
        List<Order> orders = em.createQuery("""
                        select order from Order order
                        join fetch order.member member
                        join fetch order.delivery delivery
                        """, Order.class)
                .getResultList();
        return orders.stream()
                .map(this::transform)
                .toList();
    }

    @GetMapping("/api/v3/orders")
    public List<OrderResponse> ordersV3() {
        List<Order> orders = em.createQuery("""
                        select order from Order order
                        join fetch order.member member
                        join fetch order.delivery delivery
                        join fetch order.orderItems orderItems
                        join fetch orderItems.item item
                        """, Order.class)
                .getResultList();
        return orders.stream()
                .map(this::transform)
                .toList();
    }
}
