package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ResultTest {

    @ParameterizedTest
    @EnumSource(Choice::class)
    fun `Loss equals choice value`(
        choice: Choice
    ) {

        val expected = choice.value
        val actual = Result.Loss(choice).value

        assertEquals(
            expected,
            actual
        )
    }

    @ParameterizedTest
    @EnumSource(Choice::class)
    fun `Draw adds to choice value`(
        choice: Choice
    ) {

        val expected = choice.value + 3
        val actual = Result.Draw(choice).value

        assertEquals(
            expected,
            actual
        )
    }
    @ParameterizedTest
    @EnumSource(Choice::class)
    fun `Win greatly adds to choice value`(
        choice: Choice
    ) {

        val expected = choice.value + 6
        val actual = Result.Win(choice).value

        assertEquals(
            expected,
            actual
        )
    }
}