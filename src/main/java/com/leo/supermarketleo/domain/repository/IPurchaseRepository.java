package com.leo.supermarketleo.domain.repository;

import com.leo.supermarketleo.domain.vo.PurchaseVO;

import java.util.List;
import java.util.Optional;

public interface IPurchaseRepository {
    List<PurchaseVO> getAll();
    Optional<List<PurchaseVO>> getByClient(String clientId);
    PurchaseVO save(PurchaseVO purchase);
}
