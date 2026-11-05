package com.taxurfriends.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.taxurfriends.data.local.dao.PersonDao;
import com.taxurfriends.data.local.dao.SubDao;
import com.taxurfriends.data.local.dao.TranDao;
import com.taxurfriends.data.local.dao.UserDao;
import com.taxurfriends.data.local.entity.PersonEntity;
import com.taxurfriends.data.local.entity.SubEntity;
import com.taxurfriends.data.local.entity.TranEntity;
import com.taxurfriends.data.local.entity.UserEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(
        entities = {
                UserEntity.class,
                PersonEntity.class,
                SubEntity.class,
                TranEntity.class
        },
        version = 1,
        exportSchema = false
)
@TypeConverters(PeriodTypeConverters.class)
public abstract class LocalDB extends RoomDatabase {
        private static LocalDB instance;
        private final ExecutorService databaseExecutor =
                Executors.newSingleThreadExecutor();
        public abstract UserDao userDao();
        public abstract PersonDao personDao();
        public abstract SubDao subDao();
        public abstract TranDao tranDao();
        public static synchronized LocalDB getInstance(Context context) {
                if (instance == null)
                        instance = Room.databaseBuilder(context.getApplicationContext(),
                                LocalDB.class, "tax_friends_db.db").build();


                return instance;
        }
}
