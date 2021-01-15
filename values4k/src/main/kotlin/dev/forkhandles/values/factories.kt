package dev.forkhandles.values

import java.math.BigDecimal
import java.math.BigInteger
import java.net.URL
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.OffsetTime
import java.time.Period
import java.time.Year
import java.time.YearMonth
import java.time.ZonedDateTime
import java.util.UUID

open class StringValueFactory<DOMAIN>(
    fn: (String) -> DOMAIN, validation: Validation<String>? = null
) : ValueFactory<DOMAIN, String>(fn, validation), StringParse

open class IntValueFactory<DOMAIN>(
    fn: (Int) -> DOMAIN, validation: Validation<Int>? = null
) : ValueFactory<DOMAIN, Int>(fn, validation), IntParse

open class LongValueFactory<DOMAIN>(
    fn: (Long) -> DOMAIN, validation: Validation<Long>? = null
) : ValueFactory<DOMAIN, Long>(fn, validation), LongParse

open class DoubleValueFactory<DOMAIN>(
    fn: (Double) -> DOMAIN, validation: Validation<Double>? = null
) : ValueFactory<DOMAIN, Double>(fn, validation), DoubleParse

open class FloatValueFactory<DOMAIN>(
    fn: (Float) -> DOMAIN, validation: Validation<Float>? = null
) : ValueFactory<DOMAIN, Float>(fn, validation), FloatParse

open class BooleanValueFactory<DOMAIN>(
    fn: (Boolean) -> DOMAIN, validation: Validation<Boolean>? = null
) : ValueFactory<DOMAIN, Boolean>(fn, validation), BooleanParse

open class BigIntegerValueFactory<DOMAIN>(
    fn: (BigInteger) -> DOMAIN, validation: Validation<BigInteger>? = null
) : ValueFactory<DOMAIN, BigInteger>(fn, validation), BigIntegerParse

open class BigDecimalValueFactory<DOMAIN>(
    fn: (BigDecimal) -> DOMAIN, validation: Validation<BigDecimal>? = null
) : ValueFactory<DOMAIN, BigDecimal>(fn, validation), BigDecimalParse

open class UUIDValueFactory<DOMAIN>(
    fn: (UUID) -> DOMAIN, validation: Validation<UUID>? = null
) : ValueFactory<DOMAIN, UUID>(fn, validation), UUIDParse

open class URLValueFactory<DOMAIN>(
    fn: (URL) -> DOMAIN, validation: Validation<URL>? = null
) : ValueFactory<DOMAIN, URL>(fn, validation), URLParse

open class DurationValueFactory<DOMAIN>(
    fn: (Duration) -> DOMAIN, validation: Validation<Duration>? = null
) : ValueFactory<DOMAIN, Duration>(fn, validation), DurationParse

open class InstantValueFactory<DOMAIN>(
    fn: (Instant) -> DOMAIN, validation: Validation<Instant>? = null
) : ValueFactory<DOMAIN, Instant>(fn, validation), InstantParse

open class LocalDateValueFactory<DOMAIN>(
    fn: (LocalDate) -> DOMAIN, validation: Validation<LocalDate>? = null
) : ValueFactory<DOMAIN, LocalDate>(fn, validation), LocalDateParse

open class LocalTimeValueFactory<DOMAIN>(
    fn: (LocalTime) -> DOMAIN,
    validation: Validation<LocalTime>? = null
) : ValueFactory<DOMAIN, LocalTime>(fn, validation), LocalTimeParse

open class LocalDateTimeValueFactory<DOMAIN>(
    fn: (LocalDateTime) -> DOMAIN,
    validation: Validation<LocalDateTime>? = null
) : ValueFactory<DOMAIN, LocalDateTime>(fn, validation), LocalDateTimeParse

open class OffsetDateTimeValueFactory<DOMAIN>(
    fn: (OffsetDateTime) -> DOMAIN,
    validation: Validation<OffsetDateTime>? = null
) : ValueFactory<DOMAIN, OffsetDateTime>(fn, validation), OffsetDateTimeParse

open class OffsetTimeValueFactory<DOMAIN>(
    fn: (OffsetTime) -> DOMAIN,
    validation: Validation<OffsetTime>? = null
) : ValueFactory<DOMAIN, OffsetTime>(fn, validation), OffsetTimeParse

open class PeriodValueFactory<DOMAIN>(
    fn: (Period) -> DOMAIN,
    validation: Validation<Period>? = null
) : ValueFactory<DOMAIN, Period>(fn, validation), PeriodParse

open class YearMonthValueFactory<DOMAIN>(
    fn: (YearMonth) -> DOMAIN,
    validation: Validation<YearMonth>? = null
) : ValueFactory<DOMAIN, YearMonth>(fn, validation), YearMonthParse

open class YearValueFactory<DOMAIN>(
    fn: (Year) -> DOMAIN,
    validation: Validation<Year>? = null
) : ValueFactory<DOMAIN, Year>(fn, validation), YearParse

open class ZonedDateTimeValueFactory<DOMAIN>(
    fn: (ZonedDateTime) -> DOMAIN,
    validation: Validation<ZonedDateTime>? = null
) : ValueFactory<DOMAIN, ZonedDateTime>(fn, validation), ZonedDateTimeParse
