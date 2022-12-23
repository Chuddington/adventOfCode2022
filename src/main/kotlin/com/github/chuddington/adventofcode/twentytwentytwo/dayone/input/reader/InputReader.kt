package com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader

interface InputReader {
    fun readInput(resourceName: String): List<String>
}