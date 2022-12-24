package com.github.chuddington.adventofcode.twentytwentytwo.utils.input.reader

import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.LogTagProvider

interface InputReader : LogTagProvider {
    fun readInput(resourceName: String): List<String>
}