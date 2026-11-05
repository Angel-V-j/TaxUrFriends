package com.taxurfriends.data.local.mapper;

import com.taxurfriends.data.local.entity.PersonEntity;
import com.taxurfriends.domain.model.Person;

public class PersonMapper {
    public static PersonEntity toEntity(Person person) {
        return new PersonEntity(person.getId(),
                person.getUserId(),
                person.getName(),
                person.getInfo());
    }

    public static Person toDomain(PersonEntity entity) {
        return new Person(entity.getId(),
                entity.getOwnerId(),
                entity.getName(),
                entity.getInfo());
    }
}
