package dev.forkhandles.values

import dev.forkhandles.result4k.Result
import dev.forkhandles.result4k.resultFrom

/**
 * Base value type for inline classes which enables type-safe primitives, along with Validation.
 */
abstract class ValueFactory<DOMAIN, PRIMITIVE>(
    internal val coerceFn: (PRIMITIVE) -> DOMAIN,
    private val validation: Validation<PRIMITIVE>? = null
) {
    internal fun validate(value: PRIMITIVE): DOMAIN {
        validation?.check(value)
        return coerceFn(value)
    }

    fun of(value: PRIMITIVE) = validate(value)
}

/**
 * Return a Object/null based on validation.
 */
fun <DOMAIN, PRIMITIVE> ValueFactory<DOMAIN, PRIMITIVE>.ofOrNull(value: PRIMITIVE): DOMAIN? = try {
    validate(value)
} catch (e: Exception) {
    null
}

/**
 * Return a Result4k Success/Failure based on validation.
 */
fun <DOMAIN, PRIMITIVE> ValueFactory<DOMAIN, PRIMITIVE>.ofResult4k(value: PRIMITIVE): Result<DOMAIN, Exception> =
    resultFrom { validate(value) }


/**
 * Parse a Object/null based on validation.
 */
fun <DOMAIN> Parse<DOMAIN>.parseOrNull(value: String): DOMAIN? = try {
    parse(value)
} catch (e: Exception) {
    null
}

/**
 * Return a Result4k Success/Failure based on validation.
 */
fun <DOMAIN> Parse<DOMAIN>.parseResult4k(value: String): Result<DOMAIN, Exception> =
    resultFrom { parse(value) }
