package com.taxurfriends.data.local.repo;

import static com.taxurfriends.data.local.mapper.SubMapper.toEntity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.taxurfriends.data.local.dao.SubDao;
import com.taxurfriends.data.local.mapper.SubMapper;
import com.taxurfriends.domain.model.Subscription;
import com.taxurfriends.domain.repo.SubRepo;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class SubLocalRepo implements SubRepo {
    private final SubDao subDao;
    private final Executor executor;

    public SubLocalRepo(SubDao subDao, Executor executor) {
        this.subDao = subDao;
        this.executor = executor;
    }

    @Override
    public LiveData<List<Subscription>> observeByOwner(String userId) {
        return Transformations.map(
                subDao.observeByOwner(userId),
                e -> e.stream()
                        .map(SubMapper::toDomain)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public LiveData<List<Subscription>> observeByPerson(String personId) {
        return Transformations.map(
                subDao.observeByPerson(personId),
                e -> e.stream()
                        .map(SubMapper::toDomain)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public void save(Subscription sub) {
        executor.execute(() -> subDao.save(toEntity(sub)));
    }

    @Override
    public void del(String subsId) {
        executor.execute(() -> subDao.delById(subsId));
    }
}
