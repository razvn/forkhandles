package dev.forkhandles.values

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test
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

class FactoriesTest {

    @Test
    fun `primitive factories`() {
        1.also { assertThat(IntValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        1L.also { assertThat(LongValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        1.0.also { assertThat(DoubleValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        1.0f.also { assertThat(FloatValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        "1.0".also { assertThat(BigDecimalValueFactory(::id).__parse(it), equalTo(BigDecimal(it))) }
        "1".also { assertThat(BigIntegerValueFactory(::id).__parse(it), equalTo(BigInteger(it))) }
        true.also { assertThat(BooleanValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        "hello".also { assertThat(StringValueFactory(::id).__parse(it), equalTo(it)) }
        UUID.randomUUID().also { assertThat(UUIDValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        URL("http://localhost").also { assertThat(URLValueFactory(::id).__parse(it.toString()), equalTo(it)) }

        Duration.ofHours(1).also { assertThat(DurationValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        Instant.now().also { assertThat(InstantValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        LocalDate.now().also { assertThat(LocalDateValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        LocalDateTime.now().also { assertThat(LocalDateTimeValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        LocalTime.now().also { assertThat(LocalTimeValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        OffsetDateTime.now().also { assertThat(OffsetDateTimeValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        OffsetTime.now().also { assertThat(OffsetTimeValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        Period.ofDays(1).also { assertThat(PeriodValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        Year.now().also { assertThat(YearValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        YearMonth.now().also { assertThat(YearMonthValueFactory(::id).__parse(it.toString()), equalTo(it)) }
        ZonedDateTime.now().also { assertThat(ZonedDateTimeValueFactory(::id).__parse(it.toString()), equalTo(it)) }
    }
}

private fun <T> id(t: T) = t
