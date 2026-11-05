package com.taxurfriends.domain.repo;

import com.taxurfriends.domain.model.User;

public interface AuthRepo {
    User observeCurrUser();
    User offlineRegister(String name, String email);
    User restoreLocalProfile();
    void
    login(String name, String email);
    void logout();
}
