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
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
import java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME
import java.time.format.DateTimeFormatter.ISO_LOCAL_TIME
import java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME
import java.time.format.DateTimeFormatter.ISO_OFFSET_TIME
import java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME
import java.util.UUID

open class StringValueFactory<DOMAIN>(
    fn: (String) -> DOMAIN, validation: Validation<String>? = null
) : ValueFactory<DOMAIN, String>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value)
}

open class IntValueFactory<DOMAIN>(
    fn: (Int) -> DOMAIN, validation: Validation<Int>? = null
) : ValueFactory<DOMAIN, Int>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toInt())
}

open class LongValueFactory<DOMAIN>(
    fn: (Long) -> DOMAIN, validation: Validation<Long>? = null
) : ValueFactory<DOMAIN, Long>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toLong())
}

open class DoubleValueFactory<DOMAIN>(
    fn: (Double) -> DOMAIN, validation: Validation<Double>? = null
) : ValueFactory<DOMAIN, Double>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toDouble())
}

open class FloatValueFactory<DOMAIN>(
    fn: (Float) -> DOMAIN, validation: Validation<Float>? = null
) : ValueFactory<DOMAIN, Float>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toFloat())
}

open class BooleanValueFactory<DOMAIN>(
    fn: (Boolean) -> DOMAIN, validation: Validation<Boolean>? = null
) : ValueFactory<DOMAIN, Boolean>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toBoolean())
}

open class BigIntegerValueFactory<DOMAIN>(
    fn: (BigInteger) -> DOMAIN, validation: Validation<BigInteger>? = null
) : ValueFactory<DOMAIN, BigInteger>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toBigInteger())
}

open class BigDecimalValueFactory<DOMAIN>(
    fn: (BigDecimal) -> DOMAIN, validation: Validation<BigDecimal>? = null
) : ValueFactory<DOMAIN, BigDecimal>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(value.toBigDecimal())
}

open class UUIDValueFactory<DOMAIN>(
    fn: (UUID) -> DOMAIN, validation: Validation<UUID>? = null
) : ValueFactory<DOMAIN, UUID>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(UUID.fromString(value))
}

open class URLValueFactory<DOMAIN>(
    fn: (URL) -> DOMAIN, validation: Validation<URL>? = null
) : ValueFactory<DOMAIN, URL>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(URL(value))
}

open class DurationValueFactory<DOMAIN>(
    fn: (Duration) -> DOMAIN, validation: Validation<Duration>? = null
) : ValueFactory<DOMAIN, Duration>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(Duration.parse(value))
}

open class InstantValueFactory<DOMAIN>(
    fn: (Instant) -> DOMAIN, validation: Validation<Instant>? = null
) : ValueFactory<DOMAIN, Instant>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(Instant.parse(value))
}

open class LocalDateValueFactory<DOMAIN>(
    fn: (LocalDate) -> DOMAIN, validation: Validation<LocalDate>? = null,
    private val formatter: DateTimeFormatter = ISO_LOCAL_DATE
) : ValueFactory<DOMAIN, LocalDate>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(LocalDate.parse(value, formatter))
}

open class LocalTimeValueFactory<DOMAIN>(
    fn: (LocalTime) -> DOMAIN,
    validation: Validation<LocalTime>? = null,
    private val formatter: DateTimeFormatter = ISO_LOCAL_TIME
) : ValueFactory<DOMAIN, LocalTime>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(LocalTime.parse(value, formatter))
}

open class LocalDateTimeValueFactory<DOMAIN>(
    fn: (LocalDateTime) -> DOMAIN,
    validation: Validation<LocalDateTime>? = null,
    private val formatter: DateTimeFormatter = ISO_LOCAL_DATE_TIME
) : ValueFactory<DOMAIN, LocalDateTime>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(LocalDateTime.parse(value, formatter))
}

open class OffsetDateTimeValueFactory<DOMAIN>(
    fn: (OffsetDateTime) -> DOMAIN,
    validation: Validation<OffsetDateTime>? = null,
    private val formatter: DateTimeFormatter = ISO_OFFSET_DATE_TIME
) : ValueFactory<DOMAIN, OffsetDateTime>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(OffsetDateTime.parse(value, formatter))
}

open class OffsetTimeValueFactory<DOMAIN>(
    fn: (OffsetTime) -> DOMAIN,
    validation: Validation<OffsetTime>? = null,
    private val formatter: DateTimeFormatter = ISO_OFFSET_TIME
) : ValueFactory<DOMAIN, OffsetTime>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(OffsetTime.parse(value, formatter))
}

open class PeriodValueFactory<DOMAIN>(
    fn: (Period) -> DOMAIN,
    validation: Validation<Period>? = null
) : ValueFactory<DOMAIN, Period>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(Period.parse(value))
}

open class YearMonthValueFactory<DOMAIN>(
    fn: (YearMonth) -> DOMAIN,
    validation: Validation<YearMonth>? = null,
    private val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM")
) : ValueFactory<DOMAIN, YearMonth>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(YearMonth.parse(value, formatter))
}

open class YearValueFactory<DOMAIN>(
    fn: (Year) -> DOMAIN,
    validation: Validation<Year>? = null,
    private val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy")
) : ValueFactory<DOMAIN, Year>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(Year.parse(value, formatter))
}

open class ZonedDateTimeValueFactory<DOMAIN>(
    fn: (ZonedDateTime) -> DOMAIN,
    validation: Validation<ZonedDateTime>? = null,
    private val formatter: DateTimeFormatter = ISO_ZONED_DATE_TIME
) : ValueFactory<DOMAIN, ZonedDateTime>(fn, validation), Parse<DOMAIN> {
    override fun parse(value: String) = of(ZonedDateTime.parse(value, formatter))
}
