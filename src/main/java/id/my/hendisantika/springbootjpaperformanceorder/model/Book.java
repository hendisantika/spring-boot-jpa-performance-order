package id.my.hendisantika.springbootjpaperformanceorder.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:18
 * To change this template use File | Settings | File Templates.
 */
@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
