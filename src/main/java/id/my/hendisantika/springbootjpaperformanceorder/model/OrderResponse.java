package id.my.hendisantika.springbootjpaperformanceorder.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:25
 * To change this template use File | Settings | File Templates.
 */
public record OrderResponse(Long orderId,
                            String name,
                            LocalDateTime orderDate,
                            List<ItemResponse> items,
                            int totalPrice,
                            OrderStatus orderStatus,
                            AddressResponse address
) {
}



