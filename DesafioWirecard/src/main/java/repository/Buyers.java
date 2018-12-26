package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Buyers extends JpaRepository <model.Buyer, Long> {
   
}
