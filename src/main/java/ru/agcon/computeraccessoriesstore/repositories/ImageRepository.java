package ru.agcon.computeraccessoriesstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.agcon.computeraccessoriesstore.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
