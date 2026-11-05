package com.taxurfriends.domain.repo;

import androidx.lifecycle.LiveData;

import com.taxurfriends.domain.model.Person;

import java.util.List;

public interface PersonRepo {
    LiveData<List<Person>> observeByOwner(String userId);
    void save(Person person);
    void del(String personId);
}
