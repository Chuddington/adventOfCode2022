package com.github.chuddington.adventofcode.twentytwentytwo.utils.logging

class SystemLogger : Logger {
    override fun debug(tag: String, message: String) = doLog(tag = tag, message = message)
    override fun debug(tag: String, message: () -> String) =
        doLog(tag = tag, message = message.invoke())

    override fun info(tag: String, message: String) = doLog(tag = tag, message = message)
    override fun info(tag: String, message: () -> String) =
        doLog(tag = tag, message = message.invoke())

    override fun warning(tag: String, message: String) = doLog(tag = tag, message = message)
    override fun warning(tag: String, message: () -> String) =
        doLog(tag = tag, message = message.invoke())

    override fun error(tag: String, message: String) = doLog(tag = tag, message = message)
    override fun error(tag: String, message: String, throwable: Throwable) =
        doLog(tag = tag, message = message)

    override fun error(tag: String, message: () -> String) =
        doLog(tag = tag, message = message.invoke())

    override fun error(tag: String, message: () -> String, throwable: Throwable) =
        doLog(tag = tag, message = message.invoke())

    private fun doLog(tag: String, message: String) {
        println("$tag: $message")
    }
}