package com.home.tacocloud.repositories;

import com.home.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
