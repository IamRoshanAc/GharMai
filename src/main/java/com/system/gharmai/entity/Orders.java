package com.system.gharmai.entity;

import com.system.gharmai.Pojo.OrderPojo;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders implements com.system.gharmai.Service.OrderService {
    @Id
    @SequenceGenerator(name = "cms_user_seq_gen", sequenceName = "cms_user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "cms_user_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer Orderid;
    @Column
    private String Burger ;
    private int BurgerQuantity;

    private String Snacks;
    private int SnacksQuantity;
    private String Beverages;
    private int BeveragesQuantity;

    private String Address;

    @Override
    public String SaveOrder(OrderPojo orderPojo) {
        return null;
    }

    @Override
    public Orders findByOrderid(String Orderid) {
        return null;
    }

    @Override

    public Integer getOrderid() {
        return this.Orderid;
    }



}
