package com.github.chuddington.adventofcode.twentytwentytwo.utils.logging

interface Logger {
    fun debug(tag: String, message: String)
    fun debug(tag: String, message: () -> String)

    fun info(tag: String, message: String)
    fun info(tag: String, message: () -> String)

    fun warning(tag: String, message: String)
    fun warning(tag: String, message: () -> String)

    fun error(tag: String, message: String)
    fun error(tag: String, message: String, throwable: Throwable)
    fun error(tag: String, message: () -> String)
    fun error(tag: String, message: () -> String, throwable: Throwable)
}