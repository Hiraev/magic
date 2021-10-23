package ru.magic.app

class StringProvider {
    private val stringHolder = StringHolder()

    fun getString() = stringHolder.getString()
}
