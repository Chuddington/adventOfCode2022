package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.reader

interface InputReader {
    fun readInput(resourceName: String): List<String>
}