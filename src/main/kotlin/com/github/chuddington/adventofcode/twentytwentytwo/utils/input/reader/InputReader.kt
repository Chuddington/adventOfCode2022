package com.github.chuddington.adventofcode.twentytwentytwo.utils.input.reader

interface InputReader {
    fun readInput(resourceName: String): List<String>
}