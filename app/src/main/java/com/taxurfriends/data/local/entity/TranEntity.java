package com.taxurfriends.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "transactions",
        foreignKeys = {
                @ForeignKey(
                        entity = UserEntity.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = ForeignKey.RESTRICT,
                        onUpdate = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = SubEntity.class,
                        parentColumns = "id",
                        childColumns = "subId",
                        onDelete = ForeignKey.RESTRICT,
                        onUpdate = ForeignKey.CASCADE
                )
        },
        indices = {
                @Index("userId"),
                @Index("subId")
        }
)
public class TranEntity {
    @PrimaryKey
    @NonNull
    private String id;
    @NonNull
    private String userId;
    @NonNull
    private String subId;
    private int amount;
    private boolean isBilling;
    private long date;
    private String description;

    public TranEntity(@NonNull String id, @NonNull String userId, @NonNull String subId,
                      int amount, boolean isBilling, long date, String description) {
        this.id = id;
        this.userId = userId;
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
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
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
