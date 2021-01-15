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

interface PrintFn<PRIMITIVE> {
    fun __print(value: PRIMITIVE): String = value.toString()
}

interface PrintParseFn<PRIMITIVE> : PrintFn<PRIMITIVE>, ParseFn<PRIMITIVE>

interface StringPrintParseFn : PrintParseFn<String> {
    override fun __parse(value: String) = value
}

interface BooleanPrintParseFn : PrintParseFn<Boolean> {
    override fun __parse(value: String) = value.toBoolean()
}

interface IntPrintParseFn : PrintParseFn<Int> {
    override fun __parse(value: String) = value.toInt()
}

interface LongPrintParseFn : PrintParseFn<Long> {
    override fun __parse(value: String) = value.toLong()
}

interface DoublePrintParseFn : PrintParseFn<Double> {
    override fun __parse(value: String) = value.toDouble()
}

interface FloatPrintParseFn : PrintParseFn<Float> {
    override fun __parse(value: String) = value.toFloat()
}

interface BigIntegerPrintParseFn : PrintParseFn<BigInteger> {
    override fun __parse(value: String) = value.toBigInteger()
}

interface BigDecimalPrintParseFn : PrintParseFn<BigDecimal> {
    override fun __parse(value: String) = value.toBigDecimal()
}

interface UUIDPrintParseFn : PrintParseFn<UUID> {
    override fun __parse(value: String) = UUID.fromString(value)
}

interface URLPrintParseFn : PrintParseFn<URL> {
    override fun __parse(value: String) = URL(value)
}

interface DurationPrintParseFn : PrintParseFn<Duration> {
    override fun __parse(value: String) = Duration.parse(value)
}

interface InstantPrintParseFn : PrintParseFn<Instant> {
    override fun __parse(value: String) = Instant.parse(value)
}

interface PeriodPrintParseFn : PrintParseFn<Period> {
    override fun __parse(value: String) = Period.parse(value)
}

interface LocalDatePrintParseFn : PrintParseFn<LocalDate> {
    override fun __parse(value: String) = LocalDate.parse(value, ISO_LOCAL_DATE)
    override fun __print(value: LocalDate) = ISO_LOCAL_DATE.format(value)
}

interface LocalTimePrintParseFn : PrintParseFn<LocalTime> {
    override fun __parse(value: String) = LocalTime.parse(value, ISO_LOCAL_TIME)
    override fun __print(value: LocalTime) = ISO_LOCAL_TIME.format(value)
}

interface LocalDateTimePrintParseFn : PrintParseFn<LocalDateTime> {
    override fun __parse(value: String) = LocalDateTime.parse(value, ISO_LOCAL_DATE_TIME)
    override fun __print(value: LocalDateTime) = ISO_LOCAL_DATE_TIME.format(value)
}

interface OffsetTimePrintParseFn : PrintParseFn<OffsetTime> {
    override fun __parse(value: String) = OffsetTime.parse(value, ISO_OFFSET_TIME)
    override fun __print(value: OffsetTime) = ISO_OFFSET_TIME.format(value)
}

interface OffsetDateTimePrintParseFn : PrintParseFn<OffsetDateTime> {
    override fun __parse(value: String) = OffsetDateTime.parse(value, ISO_OFFSET_DATE_TIME)
    override fun __print(value: OffsetDateTime) = ISO_OFFSET_DATE_TIME.format(value)
}

interface YearPrintParseFn : PrintParseFn<Year> {
    override fun __parse(value: String) = Year.parse(value, DateTimeFormatter.ofPattern("yyyy"))
    override fun __print(value: Year) = DateTimeFormatter.ofPattern("yyyy").format(value)
}

interface YearMonthPrintParseFn : PrintParseFn<YearMonth> {
    override fun __parse(value: String) = YearMonth.parse(value, DateTimeFormatter.ofPattern("yyyy-MM"))
    override fun __print(value: YearMonth) = DateTimeFormatter.ofPattern("yyyy-MM").format(value)
}

interface ZonedDateTimePrintParseFn : PrintParseFn<ZonedDateTime> {
    override fun __parse(value: String) = ZonedDateTime.parse(value, ISO_ZONED_DATE_TIME)
    override fun __print(value: ZonedDateTime) = ISO_ZONED_DATE_TIME.format(value)
}
