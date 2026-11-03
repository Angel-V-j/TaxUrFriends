package com.taxurfriends.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "people", indices = { @Index(value = "ownerId") })
public class PersonEntity {
    @PrimaryKey
    @NonNull
    private String id;
    @NonNull
    private String ownerId;
    @NonNull
    private String name;
    private int balance;
    private String info;
    public PersonEntity(@NonNull String id, @NonNull String ownerId, @NonNull String name,
                        int balance, String info) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.balance = balance;
        this.info = info;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    @NonNull
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(@NonNull String ownerId) {
        this.ownerId = ownerId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
