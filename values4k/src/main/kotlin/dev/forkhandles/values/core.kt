package dev.forkhandles.values

interface Factory<DOMAIN, PRIMITIVE> {
    fun of(value: PRIMITIVE): DOMAIN
}

interface Parse<DOMAIN, PRIMITIVE> : Factory<DOMAIN, PRIMITIVE>, ParseFn<PRIMITIVE> {
    fun parse(value: String) = of(__parse(value))
}

interface Print<DOMAIN> {
    fun print(t: DOMAIN) = t.toString()
}

