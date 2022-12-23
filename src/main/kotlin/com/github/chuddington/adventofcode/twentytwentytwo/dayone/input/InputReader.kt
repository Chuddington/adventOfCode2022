package com.github.chuddington.adventofcode.twentytwentytwo.dayone.input

interface InputReader {
    fun readInput(resourceName: String): List<String>
}