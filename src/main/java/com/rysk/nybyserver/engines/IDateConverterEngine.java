package com.rysk.nybyserver.engines;

import java.time.LocalDateTime;

public interface IDateConverterEngine {

    Long convertLocalDateTimeToLong(LocalDateTime localDateTime);

    LocalDateTime convertLongToLocalDateTime(Long epoch);

}
