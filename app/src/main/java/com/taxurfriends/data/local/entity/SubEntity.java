package com.taxurfriends.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.taxurfriends.domain.model.PeriodType;

@Entity(tableName = "subscriptions",
        foreignKeys = {
                @ForeignKey(
                        entity = UserEntity.class,
                        parentColumns = "id",
                        childColumns = "ownerId",
                        onDelete = ForeignKey.RESTRICT,
                        onUpdate = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = PersonEntity.class,
                        parentColumns = "id",
                        childColumns = "personId",
                        onDelete = ForeignKey.RESTRICT,
                        onUpdate = ForeignKey.CASCADE
                )
        },
        indices = {
                @Index(value = "ownerId"),
                @Index(value = "personId")
        }
)
public class SubEntity {
    @PrimaryKey
    @NonNull
    private String id;
    @NonNull
    private String ownerId;
    @NonNull
    private String personId;
    private int amount;
    private int billPeriod;
    @NonNull
    private PeriodType perType;
    private long nextDate;
    private long startDate;
    private boolean isActive;

    public SubEntity(@NonNull String id, @NonNull String ownerId, @NonNull String personId, int amount,
                     int billPeriod, @NonNull PeriodType perType, long nextDate, long startDate, boolean isActive) {
        this.id = id;
        this.ownerId = ownerId;
        this.personId = personId;
        this.amount = amount;
        this.billPeriod = billPeriod;
        this.perType = perType;
        this.nextDate = nextDate;
        this.startDate = startDate;
        this.isActive = isActive;
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
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(@NonNull String personId) {
        this.personId = personId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(int billPeriod) {
        this.billPeriod = billPeriod;
    }

    @NonNull
    public PeriodType getPerType() {
        return perType;
    }

    public void setPerType(@NonNull PeriodType perType) {
        this.perType = perType;
    }

    public long getNextDate() {
        return nextDate;
    }

    public void setNextDate(long nextDate) {
        this.nextDate = nextDate;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
