package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.reader

class FileInputReader : InputReader {

    override fun readInput(resourceName: String): List<String> =
        this::class.java.classLoader.getResourceAsStream(resourceName)
            ?.bufferedReader()
            ?.readLines() ?: emptyList()
}