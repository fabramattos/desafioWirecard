package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Payments extends JpaRepository <model.Payment, Long>{
    
}
