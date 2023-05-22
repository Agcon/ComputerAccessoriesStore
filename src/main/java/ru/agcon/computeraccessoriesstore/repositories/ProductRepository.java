package ru.agcon.computeraccessoriesstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.agcon.computeraccessoriesstore.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
