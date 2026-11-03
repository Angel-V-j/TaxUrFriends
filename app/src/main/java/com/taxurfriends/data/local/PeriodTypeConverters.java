package com.taxurfriends.data.local;

import androidx.room.TypeConverter;

import com.taxurfriends.domain.model.PeriodType;

public final class PeriodTypeConverters {
    private PeriodTypeConverters() {
    }

    @TypeConverter
    public static String fromPeriodType(PeriodType value) {
        return value == null ? null : value.name();
    }

    @TypeConverter
    public static PeriodType toPeriodType(String value) {
        return value == null ? null : PeriodType.valueOf(value);
    }
}
