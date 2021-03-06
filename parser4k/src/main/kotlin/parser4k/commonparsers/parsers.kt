package parser4k.commonparsers

import dev.forkhandles.tuples.val1
import dev.forkhandles.tuples.val2
import parser4k.Parser
import parser4k.anyCharExcept
import parser4k.commonparsers.Tokens.whitespace
import parser4k.inOrder
import parser4k.map
import parser4k.oneOf
import parser4k.oneOrMore
import parser4k.optional
import parser4k.repeat
import parser4k.skipWrapper
import parser4k.str
import parser4k.zeroOrMore

object Tokens {
    val whitespace: Parser<Char> = oneOf(' ', '\t', '\r', '\n')
    val digit: Parser<Char> = oneOf('0'..'9')
    val letter: Parser<Char> = oneOf(oneOf('a'..'z'), oneOf('A'..'Z'))

    val integer: Parser<String> = oneOrMore(digit).map { it.joinToString("") }

    val number: Parser<String> = inOrder(oneOrMore(digit), optional(inOrder(str("."), oneOrMore(digit))))
        .map { (digits, optional) ->
            digits.joinToString("") + (optional?.let { it.val1 + it.val2.joinToString("") } ?: "")
        }

    val identifier: Parser<String> = inOrder(letter, repeat(oneOf(letter, digit, oneOf('$', '_'))))
        .map { (letter, lettersAndDigits) -> letter + lettersAndDigits.joinToString("") }

    val string: Parser<String> = inOrder(str("\""), repeat(oneOf(str("\\\""), anyCharExcept('"', '\n', '\r'))), str("\""))
        .map { (_, it, _) -> it.joinToString("") }
}

fun token(s: String): Parser<String> =
    inOrder(zeroOrMore(whitespace), str(s), zeroOrMore(whitespace)).skipWrapper()

fun <T> Parser<T>.joinedWith(separator: String): Parser<List<T>> = joinedWith(str(separator))

fun <T> Parser<T>.joinedWith(separator: Parser<*>): Parser<List<T>> =
    optional(inOrder(this, repeat(inOrder(separator, this))))
        .map { optional ->
            if (optional == null) emptyList()
            else {
                val (head, tail) = optional
                listOf(head) + tail.map { it.val2 }
            }
        }
