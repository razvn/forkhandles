@file:Suppress("unused")

package dev.forkhandles.values

import java.math.BigDecimal
import java.math.BigInteger
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month
import java.time.OffsetDateTime
import java.time.OffsetTime
import java.time.Period
import java.time.Year
import java.time.YearMonth
import java.time.ZonedDateTime
import java.util.UUID

typealias StringValue = Value<String>
typealias IntValue = Value<Int>
typealias LongValue = Value<Long>
typealias DoubleValue = Value<Double>
typealias FloatValue = Value<Float>
typealias UUIDValue = Value<UUID>
typealias BigDecimalValue = Value<BigDecimal>
typealias BigIntegerValue = Value<BigInteger>
typealias LocalTimeValue = Value<LocalTime>
typealias LocalDateValue = Value<LocalDate>
typealias LocalDateTimeValue = Value<LocalDateTime>
typealias OffsetTimeValue = Value<OffsetTime>
typealias OffsetDateTimeValue = Value<OffsetDateTime>
typealias ZonedDateTimeValue = Value<ZonedDateTime>
typealias InstantValue = Value<Instant>
typealias YearMonthValue = Value<YearMonth>
typealias YearValue = Value<Year>
typealias MonthValue = Value<Month>
typealias DurationValue = Value<Duration>
typealias PeriodValue = Value<Period>

typealias StringParse<DOMAIN> = Parse<DOMAIN, String>
typealias IntParse<DOMAIN> = Parse<DOMAIN, Int>
typealias LongParse<DOMAIN> = Parse<DOMAIN, Long>
typealias DoubleParse<DOMAIN> = Parse<DOMAIN, Double>
typealias FloatParse<DOMAIN> = Parse<DOMAIN, Float>
typealias UUIDParse<DOMAIN> = Parse<DOMAIN, UUID>
typealias BigDecimalParse<DOMAIN> = Parse<DOMAIN, BigDecimal>
typealias BigIntegerParse<DOMAIN> = Parse<DOMAIN, BigInteger>
typealias LocalTimeParse<DOMAIN> = Parse<DOMAIN, LocalTime>
typealias LocalDateParse<DOMAIN> = Parse<DOMAIN, LocalDate>
typealias LocalDateTimeParse<DOMAIN> = Parse<DOMAIN, LocalDateTime>
typealias OffsetTimeParse<DOMAIN> = Parse<DOMAIN, OffsetTime>
typealias OffsetDateTimeParse<DOMAIN> = Parse<DOMAIN, OffsetDateTime>
typealias ZonedDateTimeParse<DOMAIN> = Parse<DOMAIN, ZonedDateTime>
typealias InstantParse<DOMAIN> = Parse<DOMAIN, Instant>
typealias YearMonthParse<DOMAIN> = Parse<DOMAIN, YearMonth>
typealias YearParse<DOMAIN> = Parse<DOMAIN, Year>
typealias MonthParse<DOMAIN> = Parse<DOMAIN, Month>
typealias DurationParse<DOMAIN> = Parse<DOMAIN, Duration>
typealias PeriodParse<DOMAIN> = Parse<DOMAIN, Period>
