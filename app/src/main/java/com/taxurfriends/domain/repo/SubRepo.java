package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.Subscription;

import java.util.List;

public interface SubRepo {
    List<Subscription> observeByOwner(String userId);
    List<Subscription> observeByPerson(String personId);
    void save(Subscription sub);
    void del(String subsId);
}
