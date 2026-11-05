package com.taxurfriends.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Upsert;

import com.taxurfriends.data.local.entity.SubEntity;

import java.util.List;

@Dao
public interface SubDao {
    @Query("SELECT * FROM subscriptions WHERE personId = :personId")
    LiveData<List<SubEntity>> observeByPerson(String personId);
    @Query("SELECT * FROM subscriptions WHERE ownerId = :ownerId")
    LiveData<List<SubEntity>> observeByOwner(String ownerId);
    @Query("SELECT * FROM subscriptions WHERE id = :subId LIMIT 1")
    SubEntity findById(String subId);
    @Upsert
    void save(SubEntity sub);
    @Delete
    void del(SubEntity sub);
    @Query("DELETE FROM subscriptions WHERE id = :subId")
    void delById(String subId);
    @Query("DELETE FROM subscriptions WHERE ownerId = :ownerId")
    void delByOwner(String ownerId);
}
