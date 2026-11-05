package com.taxurfriends.data.local.repo;

import static com.taxurfriends.data.local.mapper.UserMapper.toDomain;

import android.content.SharedPreferences;

import com.taxurfriends.data.local.dao.UserDao;
import com.taxurfriends.data.local.entity.UserEntity;
import com.taxurfriends.domain.model.User;
import com.taxurfriends.domain.repo.AuthRepo;

import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class AuthLocalRepo implements AuthRepo {
    private final UserDao userDao;
    private final Executor executor;
    private final SharedPreferences preferences;

    public AuthLocalRepo(UserDao userDao, Executor executor, SharedPreferences preferences) {
        this.userDao = userDao;
        this.executor = executor;
        this.preferences = preferences;
    }

    @Override
    public User observeCurrUser() {
        return null;
    }

    @Override
    public User offlineRegister(String name, String email) {
        return null;
    }

    @Override
    public User restoreLocalProfile() {
        return null;
    }

    @Override
    public void login(String name, String email) {
        executor.execute(() -> {
            String normalizedEmail = email.trim().toLowerCase(Locale.ROOT);
            String normalizedName = name.trim();

            UserEntity user = userDao.findByEmail(normalizedEmail);
            if (user == null) {
                user = new UserEntity(
                        UUID.randomUUID().toString(),
                        normalizedName,
                        normalizedEmail
                );
                userDao.insert(user);
            }

            preferences.edit()
                    .putString("current_user_id", user.getId())
                    .apply();
        });
    }

    @Override
    public void logout() {

    }
}
