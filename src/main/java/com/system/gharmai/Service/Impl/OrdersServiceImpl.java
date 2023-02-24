package com.system.gharmai.Service.Impl;
import com.system.gharmai.Pojo.OrderPojo;
import com.system.gharmai.Repo.OrdersRepo;
import com.system.gharmai.Repo.UserRepo;
import com.system.gharmai.Service.OrderService;
import com.system.gharmai.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrderService {

    private final OrdersRepo ordersRepo;


    @Override
    public String SaveOrder(OrderPojo orderPojo) {
//        Orders orders =new Orders();
//        if(OrderPojo.getOrderid()!=null){
//            orders.setOrderid(OrderPojo.getOrderid());
//        }
//        orders.setBurger(OrderPojo.getBurger());
//        orders.setBurgerQuantity(OrderPojo.getBurgerQuantity());
//        orders.setSnacks(OrderPojo.getSnacks());
//        orders.setSnacksQuantity(OrderPojo.getSnacksQuantity());
//        orders.setBeverages(OrderPojo.getBeverages());
//        orders.setBeverages(OrderPojo.getBeveragesQuantity());
//        orders.setAddress(OrderPojo.getAddress());
//
//
//        ordersRepo.save(orders);
     return "ordered";

    }

    @Override
    public Orders findByOrderid(String Orderid) {
        return null;
    }

    @Override
    public Integer getOrderid() {
        return null;
    }


}
