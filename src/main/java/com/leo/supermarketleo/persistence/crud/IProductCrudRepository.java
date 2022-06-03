package com.leo.supermarketleo.persistence.crud;

import com.leo.supermarketleo.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IProductCrudRepository extends CrudRepository<ProductEntity, Integer> {

    List<ProductEntity> findByIdCategoryOrderByNameAsc(int idCategory);

    Optional<List<ProductEntity>> findByQuantityStockLessThanAndStatus(int quantityStock, boolean status);
}
