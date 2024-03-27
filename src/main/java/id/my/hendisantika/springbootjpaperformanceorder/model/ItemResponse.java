package id.my.hendisantika.springbootjpaperformanceorder.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:26
 * To change this template use File | Settings | File Templates.
 */
public record ItemResponse(String itemName, int itemPrice, int itemCount, int orderPrice) {
}
