package com.projeto.spring_boot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private final Set<Product> products = new HashSet<>();

    public Category (Long id, String name) {

        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
