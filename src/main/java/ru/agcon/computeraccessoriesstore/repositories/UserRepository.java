package ru.agcon.computeraccessoriesstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.agcon.computeraccessoriesstore.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
