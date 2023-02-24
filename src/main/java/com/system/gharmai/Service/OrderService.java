package com.system.gharmai.Service;

import com.system.gharmai.Pojo.OrderPojo;
import com.system.gharmai.entity.Orders;

public interface OrderService {

    String SaveOrder(OrderPojo orderPojo);

    Orders findByOrderid(String Orderid);

    Integer getOrderid();
}
