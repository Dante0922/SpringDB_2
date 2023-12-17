package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "item")
public class Item {

    // IDENTITY: DB에 위임, MYSQL
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    ;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
