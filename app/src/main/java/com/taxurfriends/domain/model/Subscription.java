package com.taxurfriends.domain.model;

public class Subscription {

    private String id;
    private String userId;
    private String personId;
    private int amount;
    private int billPeriod;
    private PeriodType perType;
    private long nextDate;
    private long startDate;
    private boolean isActive;

    public Subscription(String id, String userId, String personId, int amount, int billPeriod, PeriodType perType, long nextDate, long startDate, boolean isActive) {
        this.id = id;
        this.userId = userId;
        this.personId = personId;
        this.amount = amount;
        this.billPeriod = billPeriod;
        this.perType = perType;
        this.nextDate = nextDate;
        this.startDate = startDate;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
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

    public PeriodType getPerType() {
        return perType;
    }

    public void setPerType(PeriodType perType) {
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
