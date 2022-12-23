package com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class InputReaderTest {

    @Test
    fun `obtains data from resource folder`() {
        val expected = listOf(
            "1000",
            "2000",
            "3000",
            "",
            "4000",
            "",
            "5000",
            "6000",
            "",
            "7000",
            "8000",
            "9000",
            "",
            "10000",
        )

        val scanner = FileInputReader()

        val actual = scanner.readInput("dayone/Day01_test.txt")

        Assertions.assertEquals(
            expected,
            actual
        ) {
            "The list of content should have matched!"
        }
    }
}