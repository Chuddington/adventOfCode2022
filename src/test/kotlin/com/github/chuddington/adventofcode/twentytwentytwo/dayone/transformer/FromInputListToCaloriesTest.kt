package com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.Calories
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FromInputListToCaloriesTest {

    @Test
    fun `transforms into Calories objects`() {
        val input = listOf(
            listOf("1000", "2000"),
            listOf("3000")
        )

        val expected = listOf(
            Calories(listOf(1000, 2000)),
            Calories(listOf(3000))
        )
        val actual = FromInputListToCalories().transform(input)

        assertEquals(
            expected,
            actual
        )
    }
}