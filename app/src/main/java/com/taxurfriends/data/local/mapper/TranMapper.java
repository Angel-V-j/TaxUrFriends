package com.taxurfriends.data.local.mapper;

import com.taxurfriends.data.local.entity.TranEntity;
import com.taxurfriends.domain.model.Transaction;

public class TranMapper {
    public static TranEntity toEntity(Transaction tran) {
        return new TranEntity(tran.getId(),
                tran.getUserId(),
                tran.getSubId(),
                tran.getAmount(),
                tran.getIsBilling(),
                tran.getDate(),
                tran.getDescription());
    }

    public static Transaction toDomain(TranEntity entity) {
        return new Transaction(entity.getId(),
                entity.getOwnerId(),
                entity.getSubId(),
                entity.getAmount(),
                entity.getIsBilling(),
                entity.getDate(),
                entity.getDescription());
    }
}
