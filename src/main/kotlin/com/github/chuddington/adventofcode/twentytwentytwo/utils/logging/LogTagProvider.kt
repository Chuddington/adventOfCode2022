package com.github.chuddington.adventofcode.twentytwentytwo.utils.logging

interface LogTagProvider {
    val logTag: String get() = this::class.java.simpleName
}