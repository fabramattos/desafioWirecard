package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Cards extends JpaRepository <model.Payment, Long> {
    
}
