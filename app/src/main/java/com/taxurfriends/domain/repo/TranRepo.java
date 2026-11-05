package com.taxurfriends.domain.repo;

import androidx.lifecycle.LiveData;

import com.taxurfriends.domain.model.Transaction;

import java.util.List;

public interface TranRepo {
    LiveData<List<Transaction>> observeByOwner(String userId);
    LiveData<List<Transaction>> observeBySub(String subId);
    void save(Transaction tran);
    void del(String tranId);
}
