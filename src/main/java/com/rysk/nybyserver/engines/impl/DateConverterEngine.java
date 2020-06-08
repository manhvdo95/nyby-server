package com.rysk.nybyserver.engines.impl;

import com.rysk.nybyserver.engines.IDateConverterEngine;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class DateConverterEngine implements IDateConverterEngine {

    @Override
    public Long convertLocalDateTimeToLong(LocalDateTime localDateTime) {
        return localDateTime.toEpochSecond(ZoneOffset.UTC);
    }

    @Override
    public LocalDateTime convertLongToLocalDateTime(Long epoch) {
        return LocalDateTime.ofEpochSecond(epoch, 0, ZoneOffset.UTC);
    }
}
