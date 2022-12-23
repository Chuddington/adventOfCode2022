package com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LinesSplitterTest {

    private val separator = ""
    private val oneK = "1000"
    private val twoK = "2000"
    private val threeK = "3000"

    @Test
    fun `no splitting required`() {
        val input = listOf(oneK, twoK, threeK)
        val expected = listOf(input)
        val actual = LinesSplitter(separator).split(input)

        assertEquals(expected, actual)
    }

    @Test
    fun `splits based on separator, without including separator in result`() {
        val separator = ""

        val expectedLines = listOf(
            listOf("1000", "2000"),
            listOf("3000")
        )

        val actual = LinesSplitter(separator).split(
            listOf("1000", "2000", separator, "3000")
        )

        assertEquals(
            expectedLines,
            actual
        )
    }
}