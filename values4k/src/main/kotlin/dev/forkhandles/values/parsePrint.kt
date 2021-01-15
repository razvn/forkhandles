package dev.forkhandles.values

fun interface Parse<DOMAIN> {
    fun parse(value: String): DOMAIN
}

interface Print<DOMAIN> {
    fun print(t: DOMAIN) = t.toString()
}

interface ParsePrint<DOMAIN : Value<PRIMITIVE>, PRIMITIVE : Any> : Print<DOMAIN>, Parse<PRIMITIVE> {
    override fun print(t: DOMAIN) = t.value.toString()
}
