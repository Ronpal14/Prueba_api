package aprendiendo.api.backend.model.repository;

import aprendiendo.api.backend.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductEntityRepository extends JpaRepository<ProductEntity, Long> {
}

