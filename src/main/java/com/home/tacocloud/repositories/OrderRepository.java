package com.home.tacocloud.repositories;

import com.home.tacocloud.domain.TacoOrder;
import com.home.tacocloud.domain.User;
import org.hibernate.criterion.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user);
}
