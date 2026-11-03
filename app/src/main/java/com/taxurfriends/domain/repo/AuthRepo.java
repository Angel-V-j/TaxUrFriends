package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.User;

public interface AuthRepo {
    User observeCurrUser();
    User offRegister(String name, String pass);
    User restoreLocalProfile();
    User login(String name, String pass);
    void logout();
}
