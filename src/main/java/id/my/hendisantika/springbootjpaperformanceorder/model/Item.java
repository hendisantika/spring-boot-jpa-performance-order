package id.my.hendisantika.springbootjpaperformanceorder.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.InheritanceType.SINGLE_TABLE;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-performance-order
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/27/24
 * Time: 07:17
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

//    @ManyToMany(mappedBy = "items")
//    private List<Category> categories = new ArrayList<>();
}
