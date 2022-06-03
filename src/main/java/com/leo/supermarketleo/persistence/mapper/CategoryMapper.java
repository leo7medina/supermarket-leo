package com.leo.supermarketleo.persistence.mapper;

import com.leo.supermarketleo.domain.vo.CategoryVO;
import com.leo.supermarketleo.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "id", target = "categoryId"),
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "status", target = "active"),
    })
    CategoryVO toCategoryVO(CategoryEntity categoryEntity);

    @InheritInverseConfiguration
    @Mapping(target = "productCol", ignore = true)
    CategoryEntity toCategoryEntity(CategoryVO category);

}
