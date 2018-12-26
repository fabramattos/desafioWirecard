package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Clients extends JpaRepository<model.Client, Long> {
    
}
