package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.Person;

import java.util.List;

public interface PersonRepo {
    List<Person> observeByOwner(String userId);
    void save(Person person);
    void del(String personId);
}
