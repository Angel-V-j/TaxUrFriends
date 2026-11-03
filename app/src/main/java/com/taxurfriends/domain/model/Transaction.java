package com.taxurfriends.domain.model;

public class Transaction {
    private String id;
    private String userId;
    private String subId;
    private int amount;
    private boolean isBilling;
    private long date;
    private String description;

    public Transaction(String id, String userId, String subId, int amount, boolean isBilling, long date, String description) {
        this.id = id;
        this.userId = userId;
        this.subId = subId;
        this.amount = amount;
        this.isBilling = isBilling;
        this.date = date;
        this.description = description;
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

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
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
