package com.taxurfriends.data.local.mapper;

import com.taxurfriends.data.local.entity.SubEntity;
import com.taxurfriends.domain.model.Subscription;

public class SubMapper {
    public static SubEntity toEntity(Subscription sub) {
        return new SubEntity(sub.getId(),
                sub.getUserId(),
                sub.getPersonId(),
                sub.getAmount(),
                sub.getBillPeriod(),
                sub.getPerType(),
                sub.getNextDate(),
                sub.getStartDate(),
                sub.isActive());
    }

    public static Subscription toDomain(SubEntity entity) {
        return new Subscription(entity.getId(),
                entity.getOwnerId(),
                entity.getPersonId(),
                entity.getAmount(),
                entity.getBillPeriod(),
                entity.getPerType(),
                entity.getNextDate(),
                entity.getStartDate(),
                entity.isActive());
    }
}
