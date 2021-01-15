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

interface ParseFn<PRIMITIVE> {
    fun __parse(value: String): PRIMITIVE
}

interface StringParseFn : ParseFn<String> {
    override fun __parse(value: String) = value
}

interface BooleanParseFn : ParseFn<Boolean> {
    override fun __parse(value: String) = value.toBoolean()
}

interface IntParseFn : ParseFn<Int> {
    override fun __parse(value: String) = value.toInt()
}

interface LongParseFn : ParseFn<Long> {
    override fun __parse(value: String) = value.toLong()
}

interface DoubleParseFn : ParseFn<Double> {
    override fun __parse(value: String) = value.toDouble()
}

interface FloatParseFn : ParseFn<Float> {
    override fun __parse(value: String) = value.toFloat()
}

interface BigIntegerParseFn : ParseFn<BigInteger> {
    override fun __parse(value: String) = value.toBigInteger()
}

interface BigDecimalParseFn : ParseFn<BigDecimal> {
    override fun __parse(value: String) = value.toBigDecimal()
}

interface UUIDParseFn : ParseFn<UUID> {
    override fun __parse(value: String) = UUID.fromString(value)
}

interface URLParseFn : ParseFn<URL> {
    override fun __parse(value: String) = URL(value)
}

interface DurationParseFn : ParseFn<Duration> {
    override fun __parse(value: String) = Duration.parse(value)
}

interface InstantParseFn : ParseFn<Instant> {
    override fun __parse(value: String) = Instant.parse(value)
}

interface PeriodParseFn : ParseFn<Period> {
    override fun __parse(value: String) = Period.parse(value)
}

interface LocalDateParseFn : ParseFn<LocalDate> {
    override fun __parse(value: String) = LocalDate.parse(value, ISO_LOCAL_DATE)
}

interface LocalTimeParseFn : ParseFn<LocalTime> {
    override fun __parse(value: String) = LocalTime.parse(value, ISO_LOCAL_TIME)
}

interface LocalDateTimeParseFn : ParseFn<LocalDateTime> {
    override fun __parse(value: String) = LocalDateTime.parse(value, ISO_LOCAL_DATE_TIME)
}

interface OffsetTimeParseFn : ParseFn<OffsetTime> {
    override fun __parse(value: String) = OffsetTime.parse(value, ISO_OFFSET_TIME)
}

interface OffsetDateTimeParseFn : ParseFn<OffsetDateTime> {
    override fun __parse(value: String) = OffsetDateTime.parse(value, ISO_OFFSET_DATE_TIME)
}

interface YearParseFn : ParseFn<Year> {
    override fun __parse(value: String) = Year.parse(value, DateTimeFormatter.ofPattern("yyyy"))
}

interface YearMonthParseFn : ParseFn<YearMonth> {
    override fun __parse(value: String) = YearMonth.parse(value, DateTimeFormatter.ofPattern("yyyy-MM"))
}

interface ZonedDateTimeParseFn : ParseFn<ZonedDateTime> {
    override fun __parse(value: String) = ZonedDateTime.parse(value, ISO_ZONED_DATE_TIME)
}
