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
typealias BooleanValue = Value<Boolean>
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

typealias StringPrintParse<DOMAIN> = PrintParse<DOMAIN, String>
typealias BooleanPrintParse<DOMAIN> = PrintParse<DOMAIN, Boolean>
typealias IntPrintParse<DOMAIN> = PrintParse<DOMAIN, Int>
typealias LongPrintParse<DOMAIN> = PrintParse<DOMAIN, Long>
typealias DoublePrintParse<DOMAIN> = PrintParse<DOMAIN, Double>
typealias FloatPrintParse<DOMAIN> = PrintParse<DOMAIN, Float>
typealias UUIDPrintParse<DOMAIN> = PrintParse<DOMAIN, UUID>
typealias BigDecimalPrintParse<DOMAIN> = PrintParse<DOMAIN, BigDecimal>
typealias BigIntegerPrintParse<DOMAIN> = PrintParse<DOMAIN, BigInteger>
typealias LocalTimePrintParse<DOMAIN> = PrintParse<DOMAIN, LocalTime>
typealias LocalDatePrintParse<DOMAIN> = PrintParse<DOMAIN, LocalDate>
typealias LocalDateTimePrintParse<DOMAIN> = PrintParse<DOMAIN, LocalDateTime>
typealias OffsetTimePrintParse<DOMAIN> = PrintParse<DOMAIN, OffsetTime>
typealias OffsetDateTimePrintParse<DOMAIN> = PrintParse<DOMAIN, OffsetDateTime>
typealias ZonedDateTimePrintParse<DOMAIN> = PrintParse<DOMAIN, ZonedDateTime>
typealias InstantPrintParse<DOMAIN> = PrintParse<DOMAIN, Instant>
typealias YearMonthPrintParse<DOMAIN> = PrintParse<DOMAIN, YearMonth>
typealias YearPrintParse<DOMAIN> = PrintParse<DOMAIN, Year>
typealias MonthPrintParse<DOMAIN> = PrintParse<DOMAIN, Month>
typealias DurationPrintParse<DOMAIN> = PrintParse<DOMAIN, Duration>
typealias PeriodPrintParse<DOMAIN> = PrintParse<DOMAIN, Period>
