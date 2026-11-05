package com.taxurfriends.data.local.repo;

import static com.taxurfriends.data.local.mapper.TranMapper.toEntity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.taxurfriends.data.local.dao.TranDao;
import com.taxurfriends.data.local.mapper.TranMapper;
import com.taxurfriends.domain.model.Transaction;
import com.taxurfriends.domain.repo.TranRepo;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class TranLocalRepo implements TranRepo {
    private final TranDao tranDao;
    private final Executor executor;

    public TranLocalRepo(TranDao tranDao, Executor executor) {
        this.tranDao = tranDao;
        this.executor = executor;
    }

    @Override
    public LiveData<List<Transaction>> observeByOwner(String userId) {
        return Transformations.map(
                tranDao.observeByOwner(userId),
                e -> e.stream()
                        .map(TranMapper::toDomain)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public LiveData<List<Transaction>> observeBySub(String subId) {
        return Transformations.map(
                tranDao.observeBySub(subId),
                e -> e.stream()
                        .map(TranMapper::toDomain)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public void save(Transaction tran) {
        executor.execute(() -> tranDao.save(toEntity(tran)));
    }

    @Override
    public void del(String tranId) {
        executor.execute(() -> tranDao.delById(tranId));
    }
}
