package com.taxurfriends.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "transactions",
        foreignKeys = {
                @ForeignKey(
                        entity = SubEntity.class,
                        parentColumns = "id",
                        childColumns = "subId",
                        onDelete = ForeignKey.RESTRICT,
                        onUpdate = ForeignKey.CASCADE
                )
        },
        indices = {
                @Index(value = "ownerId"),
                @Index(value = "subId")
        }
)
public class TranEntity {
    @PrimaryKey
    @NonNull
    private String id;
    @NonNull
    private String ownerId;
    @NonNull
    private String subId;
    private int amount;
    private boolean isBilling;
    private long date;
    private String description;

    public TranEntity(@NonNull String id, @NonNull String ownerId, @NonNull String subId,
                      int amount, boolean isBilling, long date, String description) {
        this.id = id;
        this.ownerId = ownerId;
        this.subId = subId;
        this.amount = amount;
        this.isBilling = isBilling;
        this.date = date;
        this.description = description;
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
    public String getSubId() {
        return subId;
    }

    public void setSubId(@NonNull String subId) {
        this.subId = subId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean getIsBilling() {
        return isBilling;
    }

    public void setIsBilling(boolean isBilling) {
        this.isBilling = isBilling;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
