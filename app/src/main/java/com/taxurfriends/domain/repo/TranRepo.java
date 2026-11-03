package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.Transaction;

import java.util.List;

public interface TranRepo {
    List<Transaction> observeByOwner(String userId);
    List<Transaction> observeBySub(String subId);
    void save(Transaction tran);
    void del(String tranId);
}
