package com.leo.supermarketleo.persistence.mapper;

import com.leo.supermarketleo.domain.vo.PurchaseItemVO;
import com.leo.supermarketleo.persistence.entity.PurchaseProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProduct", target = "productId"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "status", target = "active")
    })
    PurchaseItemVO toPurchaseItemVO(PurchaseProductEntity product);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchaseEntity", ignore = true),
            @Mapping(target = "productEntity", ignore = true),
            @Mapping(target = "id.idPurchase", ignore = true)
    })
    PurchaseProductEntity toPurchaseProductEntity(PurchaseItemVO item);
}
