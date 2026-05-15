package com.projeto.spring_boot.repositories;


import com.projeto.spring_boot.entities.OrderItem;
import com.projeto.spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
