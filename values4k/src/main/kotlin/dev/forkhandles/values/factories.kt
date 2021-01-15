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
) : ValueFactory<DOMAIN, String>(fn, validation), StringParseFn

open class IntValueFactory<DOMAIN>(
    fn: (Int) -> DOMAIN, validation: Validation<Int>? = null
) : ValueFactory<DOMAIN, Int>(fn, validation), IntParseFn

open class LongValueFactory<DOMAIN>(
    fn: (Long) -> DOMAIN, validation: Validation<Long>? = null
) : ValueFactory<DOMAIN, Long>(fn, validation), LongParseFn

open class DoubleValueFactory<DOMAIN>(
    fn: (Double) -> DOMAIN, validation: Validation<Double>? = null
) : ValueFactory<DOMAIN, Double>(fn, validation), DoubleParseFn

open class FloatValueFactory<DOMAIN>(
    fn: (Float) -> DOMAIN, validation: Validation<Float>? = null
) : ValueFactory<DOMAIN, Float>(fn, validation), FloatParseFn

open class BooleanValueFactory<DOMAIN>(
    fn: (Boolean) -> DOMAIN, validation: Validation<Boolean>? = null
) : ValueFactory<DOMAIN, Boolean>(fn, validation), BooleanParseFn

open class BigIntegerValueFactory<DOMAIN>(
    fn: (BigInteger) -> DOMAIN, validation: Validation<BigInteger>? = null
) : ValueFactory<DOMAIN, BigInteger>(fn, validation), BigIntegerParseFn

open class BigDecimalValueFactory<DOMAIN>(
    fn: (BigDecimal) -> DOMAIN, validation: Validation<BigDecimal>? = null
) : ValueFactory<DOMAIN, BigDecimal>(fn, validation), BigDecimalParseFn

open class UUIDValueFactory<DOMAIN>(
    fn: (UUID) -> DOMAIN, validation: Validation<UUID>? = null
) : ValueFactory<DOMAIN, UUID>(fn, validation), UUIDParseFn

open class URLValueFactory<DOMAIN>(
    fn: (URL) -> DOMAIN, validation: Validation<URL>? = null
) : ValueFactory<DOMAIN, URL>(fn, validation), URLParseFn

open class DurationValueFactory<DOMAIN>(
    fn: (Duration) -> DOMAIN, validation: Validation<Duration>? = null
) : ValueFactory<DOMAIN, Duration>(fn, validation), DurationParseFn

open class InstantValueFactory<DOMAIN>(
    fn: (Instant) -> DOMAIN, validation: Validation<Instant>? = null
) : ValueFactory<DOMAIN, Instant>(fn, validation), InstantParseFn

open class LocalDateValueFactory<DOMAIN>(
    fn: (LocalDate) -> DOMAIN, validation: Validation<LocalDate>? = null
) : ValueFactory<DOMAIN, LocalDate>(fn, validation), LocalDateParseFn

open class LocalTimeValueFactory<DOMAIN>(
    fn: (LocalTime) -> DOMAIN,
    validation: Validation<LocalTime>? = null
) : ValueFactory<DOMAIN, LocalTime>(fn, validation), LocalTimeParseFn

open class LocalDateTimeValueFactory<DOMAIN>(
    fn: (LocalDateTime) -> DOMAIN,
    validation: Validation<LocalDateTime>? = null
) : ValueFactory<DOMAIN, LocalDateTime>(fn, validation), LocalDateTimeParseFn

open class OffsetDateTimeValueFactory<DOMAIN>(
    fn: (OffsetDateTime) -> DOMAIN,
    validation: Validation<OffsetDateTime>? = null
) : ValueFactory<DOMAIN, OffsetDateTime>(fn, validation), OffsetDateTimeParseFn

open class OffsetTimeValueFactory<DOMAIN>(
    fn: (OffsetTime) -> DOMAIN,
    validation: Validation<OffsetTime>? = null
) : ValueFactory<DOMAIN, OffsetTime>(fn, validation), OffsetTimeParseFn

open class PeriodValueFactory<DOMAIN>(
    fn: (Period) -> DOMAIN,
    validation: Validation<Period>? = null
) : ValueFactory<DOMAIN, Period>(fn, validation), PeriodParseFn

open class YearMonthValueFactory<DOMAIN>(
    fn: (YearMonth) -> DOMAIN,
    validation: Validation<YearMonth>? = null
) : ValueFactory<DOMAIN, YearMonth>(fn, validation), YearMonthParseFn

open class YearValueFactory<DOMAIN>(
    fn: (Year) -> DOMAIN,
    validation: Validation<Year>? = null
) : ValueFactory<DOMAIN, Year>(fn, validation), YearParseFn

open class ZonedDateTimeValueFactory<DOMAIN>(
    fn: (ZonedDateTime) -> DOMAIN,
    validation: Validation<ZonedDateTime>? = null
) : ValueFactory<DOMAIN, ZonedDateTime>(fn, validation), ZonedDateTimeParseFn
