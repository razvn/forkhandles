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

fun interface Parse<PRIMITIVE> {
    fun parse(value: String): PRIMITIVE
}

interface StringParse : Parse<String> {
    override fun parse(value: String): String = value
}

interface BooleanParse : Parse<Boolean> {
    override fun parse(value: String): Boolean = value.toBoolean()
}

interface IntParse : Parse<Int> {
    override fun parse(value: String): Int = value.toInt()
}

interface LongParse : Parse<Long> {
    override fun parse(value: String): Long = value.toLong()
}

interface DoubleParse : Parse<Double> {
    override fun parse(value: String): Double = value.toDouble()
}

interface FloatParse : Parse<Float> {
    override fun parse(value: String): Float = value.toFloat()
}

interface BigIntegerParse : Parse<BigInteger> {
    override fun parse(value: String): BigInteger = value.toBigInteger()
}

interface BigDecimalParse : Parse<BigDecimal> {
    override fun parse(value: String): BigDecimal = value.toBigDecimal()
}

interface UUIDParse : Parse<UUID> {
    override fun parse(value: String): UUID = UUID.fromString(value)
}

interface URLParse : Parse<URL> {
    override fun parse(value: String) = URL(value)
}

interface DurationParse : Parse<Duration> {
    override fun parse(value: String): Duration = Duration.parse(value)
}

interface InstantParse : Parse<Instant> {
    override fun parse(value: String): Instant = Instant.parse(value)
}

interface PeriodParse : Parse<Period> {
    override fun parse(value: String): Period = Period.parse(value)
}

interface LocalDateParse : Parse<LocalDate> {
    override fun parse(value: String): LocalDate = LocalDate.parse(value, ISO_LOCAL_DATE)
}

interface LocalTimeParse : Parse<LocalTime> {
    override fun parse(value: String): LocalTime = LocalTime.parse(value, ISO_LOCAL_TIME)
}

interface LocalDateTimeParse : Parse<LocalDateTime> {
    override fun parse(value: String): LocalDateTime = LocalDateTime.parse(value, ISO_LOCAL_DATE_TIME)
}

interface OffsetTimeParse : Parse<OffsetTime> {
    override fun parse(value: String): OffsetTime = OffsetTime.parse(value, ISO_OFFSET_TIME)
}

interface OffsetDateTimeParse : Parse<OffsetDateTime> {
    override fun parse(value: String): OffsetDateTime = OffsetDateTime.parse(value, ISO_OFFSET_DATE_TIME)
}

interface YearParse : Parse<Year> {
    override fun parse(value: String): Year = Year.parse(value, DateTimeFormatter.ofPattern("yyyy"))
}

interface YearMonthParse : Parse<YearMonth> {
    override fun parse(value: String): YearMonth = YearMonth.parse(value, DateTimeFormatter.ofPattern("yyyy-MM"))
}

interface ZonedDateTimeParse : Parse<ZonedDateTime> {
    override fun parse(value: String): ZonedDateTime = ZonedDateTime.parse(value, ISO_ZONED_DATE_TIME)
}
