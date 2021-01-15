package dev.forkhandles.values

interface Factory<DOMAIN, PRIMITIVE> {
    fun of(value: PRIMITIVE): DOMAIN
}

interface PrintParse<DOMAIN, PRIMITIVE> : Factory<DOMAIN, PRIMITIVE>, PrintParseFn<PRIMITIVE> {
    fun parse(value: String) = of(__parse(value))
}
