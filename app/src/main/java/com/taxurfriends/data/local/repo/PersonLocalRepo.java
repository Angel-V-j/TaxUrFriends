package com.taxurfriends.data.local.repo;

import static com.taxurfriends.data.local.mapper.PersonMapper.toEntity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.taxurfriends.data.local.dao.PersonDao;
import com.taxurfriends.data.local.mapper.PersonMapper;
import com.taxurfriends.domain.model.Person;
import com.taxurfriends.domain.repo.PersonRepo;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class PersonLocalRepo implements PersonRepo {
    private final PersonDao personDao;
    private final Executor executor;

    public PersonLocalRepo(PersonDao personDao, Executor executor) {
        this.personDao = personDao;
        this.executor = executor;
    }

    @Override
    public LiveData<List<Person>> observeByOwner(String userId) {
        return Transformations.map(
                personDao.observeByOwner(userId),
                e -> e.stream()
                        .map(PersonMapper::toDomain)
                        .collect(Collectors.toList())
                );
    }

    @Override
    public void save(Person person) {
        executor.execute(() -> personDao.save(toEntity(person)));
    }

    @Override
    public void del(String personId) {
        executor.execute(() -> personDao.delById(personId));
    }
}
