package com.system.gharmai.Repo;

import com.system.gharmai.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepo extends JpaRepository<Orders,Integer> {
    @Query(value="select * from users where Orderid=?1", nativeQuery = true)
    Optional<Orders> findByOrderid(String Orderid );

}