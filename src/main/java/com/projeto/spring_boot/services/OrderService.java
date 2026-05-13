package com.projeto.spring_boot.services;

import com.projeto.spring_boot.entities.Order;
import com.projeto.spring_boot.entities.User;
import com.projeto.spring_boot.repositories.OrderRepository;
import com.projeto.spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
