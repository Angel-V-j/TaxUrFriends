package com.taxurfriends.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.taxurfriends.data.local.entity.TranEntity;

import java.util.List;

@Dao
public interface TranDao {
    @Query("SELECT * FROM transactions WHERE id = :tranId LIMIT 1")
    TranEntity findById(String tranId);
    @Query("SELECT * FROM transactions WHERE subId = :subId")
    List<TranEntity> findBySub(String subId);
    @Query("SELECT * FROM transactions WHERE ownerId = :ownerId")
    List<TranEntity> findByOwner(String ownerId);
    @Upsert
    void save(TranEntity tran);
    @Delete
    void del(TranEntity tran);
    @Query("DELETE FROM transactions WHERE id = :tranId")
    void delById(String tranId);
    @Query("DELETE FROM transactions WHERE subId = :subId")
    void delBySub(String subId);
    @Query("DELETE FROM transactions WHERE ownerId = :ownerId")
    void delByOwner(String ownerId);
}
