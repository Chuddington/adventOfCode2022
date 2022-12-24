package com.github.chuddington.adventofcode.twentytwentytwo.utils.input.reader

import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.Logger

class FileInputReader(
    private val logger: Logger
) : InputReader {

    override fun readInput(resourceName: String): List<String> {
        val result = this::class.java.classLoader.getResourceAsStream(resourceName)
            ?.bufferedReader()
            ?.readLines() ?: emptyList()

        logger.info(logTag) {
            "Read $resourceName with a total of ${result.size} lines."
        }

        return result
    }
}
