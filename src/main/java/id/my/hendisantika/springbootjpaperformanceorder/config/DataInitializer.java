package id.my.hendisantika.springbootjpaperformanceorder.config;

import id.my.hendisantika.springbootjpaperformanceorder.model.Address;
import id.my.hendisantika.springbootjpaperformanceorder.model.Book;
import id.my.hendisantika.springbootjpaperformanceorder.model.Delivery;
import id.my.hendisantika.springbootjpaperformanceorder.model.DeliveryStatus;
import id.my.hendisantika.springbootjpaperformanceorder.model.Member;
import id.my.hendisantika.springbootjpaperformanceorder.model.Order;
import id.my.hendisantika.springbootjpaperformanceorder.model.OrderItem;
import id.my.hendisantika.springbootjpaperformanceorder.model.OrderStatus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

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

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Member firstMember = new Member();
        firstMember.setName("Song Hye Kyo");
        firstMember.setAddress(new Address("Seoul", "Gangnam", "12345"));
        em.persist(firstMember);

        Member secondMember = new Member();
        secondMember.setName("Rain");
        secondMember.setAddress(new Address("Seoul", "Gangnam", "12345"));
        em.persist(secondMember);

        Book firstBook = new Book();
        firstBook.setName("Jay Book");
        firstBook.setPrice(10000);
        firstBook.setStockQuantity(10);
        firstBook.setAuthor("Jay");
        firstBook.setIsbn("12345");
        em.persist(firstBook);

        Book secondBook = new Book();
        secondBook.setName("Su Book");
        secondBook.setPrice(20000);
        secondBook.setStockQuantity(10);
        secondBook.setAuthor("Su");
        secondBook.setIsbn("99999");
        em.persist(secondBook);

        var firstOrderItem = new OrderItem();
        firstOrderItem.setItem(firstBook);
        firstOrderItem.setCount(1);
        firstOrderItem.setOrderPrice(10000);

        var secondOrderItem = new OrderItem();
        secondOrderItem.setItem(secondBook);
        secondOrderItem.setCount(1);
        secondOrderItem.setOrderPrice(20000);

        var thirdOrderItem = new OrderItem();
        thirdOrderItem.setItem(secondBook);
        thirdOrderItem.setCount(1);
        thirdOrderItem.setOrderPrice(20000);


        Order firstOrder = new Order();
        firstOrder.setMember(firstMember);
        firstOrder.setOrderItems(List.of(firstOrderItem, thirdOrderItem));
        firstOrder.setOrderDate(LocalDateTime.now());
        firstOrder.setStatus(OrderStatus.ORDERED);

        var firstDelivery = new Delivery();
        firstDelivery.setAddress(firstMember.getAddress());
        firstDelivery.setStatus(DeliveryStatus.DELIVERING);
        firstOrder.setDelivery(firstDelivery);

        firstOrderItem.setOrder(firstOrder);
        thirdOrderItem.setOrder(firstOrder);

        em.persist(firstOrder);

        Order secondOrder = new Order();
        secondOrder.setMember(secondMember);
        secondOrder.setOrderItems(List.of(secondOrderItem));
        secondOrder.setOrderDate(LocalDateTime.now());
        secondOrder.setStatus(OrderStatus.ORDERED);

        var secondDelivery = new Delivery();
        secondDelivery.setAddress(secondMember.getAddress());
        secondDelivery.setStatus(DeliveryStatus.DELIVERING);
        secondOrder.setDelivery(secondDelivery);

        secondOrderItem.setOrder(secondOrder);

        em.persist(secondOrder);

//        for (int i = 0; i < 10000; i++) {
        var newOrderItem = new OrderItem();
        newOrderItem.setItem(firstBook);
        newOrderItem.setCount(1);
        newOrderItem.setOrderPrice(10000);

        var order = new Order();
        order.setMember(firstMember);
        order.setOrderItems(List.of(newOrderItem));
        order.setOrderDate(LocalDateTime.now());
        order.setStatus(OrderStatus.ORDERED);


        newOrderItem.setOrder(order);

        var delivery = new Delivery();
        delivery.setAddress(firstMember.getAddress());
        delivery.setStatus(DeliveryStatus.DELIVERING);
        order.setDelivery(delivery);

        em.persist(order);
//        }
    }
}
