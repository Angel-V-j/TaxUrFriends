package com.taxurfriends.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.taxurfriends.data.local.entity.PersonEntity;
import java.util.List;

@Dao
public interface PersonDao {
    @Query("SELECT * FROM people WHERE id = :personId LIMIT 1")
    PersonEntity findById(String personId);
    @Query("SELECT * FROM people WHERE ownerId = :ownerId")
    List<PersonEntity> findByOwner(String ownerId);
    @Upsert
    void save(PersonEntity person);
    @Delete
    void del(PersonEntity person);
    @Query("DELETE FROM people WHERE id = :personId")
    void delById(String personId);
    @Query("DELETE FROM people WHERE ownerId = :ownerId")
    void delByOwner(String ownerId);
}
