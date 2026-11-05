package com.taxurfriends.domain.repo;

import androidx.lifecycle.LiveData;

import com.taxurfriends.domain.model.Subscription;

import java.util.List;

public interface SubRepo {
    LiveData<List<Subscription>> observeByOwner(String userId);
    LiveData<List<Subscription>> observeByPerson(String personId);
    void save(Subscription sub);
    void del(String subsId);
}
