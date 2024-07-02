package com.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	/*
	@Query("select sum(i.price),o.customer.id from Order o JOIN o.items i group by o.customer.id")
    public List<Integer[]> findTotal();
    */
}
