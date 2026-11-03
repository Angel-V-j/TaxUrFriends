package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.User;

public interface AuthRepo {
    User observeCurrUser();
    User offRegister(String name);
    User restoreLocalProfile();
    User login(String name);
    void logout();
}
