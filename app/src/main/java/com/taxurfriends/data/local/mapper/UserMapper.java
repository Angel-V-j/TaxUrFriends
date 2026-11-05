package com.taxurfriends.data.local.mapper;

import com.taxurfriends.data.local.entity.SubEntity;
import com.taxurfriends.data.local.entity.UserEntity;
import com.taxurfriends.domain.model.Subscription;
import com.taxurfriends.domain.model.User;

public class UserMapper {
    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getId(),
                user.getUserName(),
                user.getEmail());
    }

    public static User toDomain(UserEntity entity) {
        return new User(entity.getId(),
                entity.getName(),
                entity.getEmail());
    }
}
