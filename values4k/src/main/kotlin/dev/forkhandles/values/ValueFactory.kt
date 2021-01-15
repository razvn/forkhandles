package dev.forkhandles.values

import dev.forkhandles.result4k.Result
import dev.forkhandles.result4k.resultFrom

/**
 * Base value type for inline classes which enables type-safe primitives, along with Validation.
 */
abstract class ValueFactory<DOMAIN, PRIMITIVE>(
    protected val coerceFn: (PRIMITIVE) -> DOMAIN,
    private val validation: Validation<PRIMITIVE>? = null
) : Factory<DOMAIN, PRIMITIVE> {
    internal fun validate(value: PRIMITIVE): DOMAIN {
        validation?.check(value)
        return coerceFn(value)
    }

    override fun of(value: PRIMITIVE) = validate(value)
}

/**
 * Return an object/null based on validation.
 */
fun <DOMAIN, PRIMITIVE> ValueFactory<DOMAIN, PRIMITIVE>.ofOrNull(value: PRIMITIVE): DOMAIN? = try {
    validate(value)
} catch (e: Exception) {
    null
}

/**
 * Parse an object/null based on validation.
 */
fun <DOMAIN, PRIMITIVE> Parse<DOMAIN, PRIMITIVE>.parseOrNull(value: String): DOMAIN? = try {
    parse(value)
} catch (e: Exception) {
    null
}

/**
 * Return a Result4k Success/Failure based on validation.
 */
fun <DOMAIN, PRIMITIVE> ValueFactory<DOMAIN, PRIMITIVE>.ofResult4k(value: PRIMITIVE): Result<DOMAIN, Exception> =
    resultFrom { validate(value) }

/**
 * Return a Result4k Success/Failure based on validation.
 */
fun <DOMAIN, PRIMITIVE> Parse<DOMAIN, PRIMITIVE>.parseResult4k(value: String): Result<DOMAIN, Exception> =
    resultFrom { parse(value) }
