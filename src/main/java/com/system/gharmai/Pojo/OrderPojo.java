package com.system.gharmai.Pojo;

import com.system.gharmai.entity.Orders;
import com.system.gharmai.entity.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderPojo {
    private Integer Orderid;
    private String Burger ;
    private int BurgerQuantity;

    private String Snacks;
    private int SnacksQuantity;
    private String Beverages;
    private int BeveragesQuantity;

    private String Address;

    public OrderPojo(Orders orders) {
        this.Orderid = orders.getOrderid();
        this.Burger = orders.getBurger();
        this.BurgerQuantity = orders.getBurgerQuantity();
        this.Beverages = orders.getBeverages();
        this.BeveragesQuantity = orders.getBeveragesQuantity();
        this.Snacks = orders.getSnacks();
        this.SnacksQuantity = orders.getSnacksQuantity();
        this.Address=orders.getAddress();

    }
}
