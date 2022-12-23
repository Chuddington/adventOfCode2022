package com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.IterableCalories
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FromInputListToIterableCaloriesTest {

    @Test
    fun `transforms into Calories objects`() {
        val input = listOf(
            listOf("1000", "2000"),
            listOf("3000")
        )

        val expected = listOf(
            IterableCalories(listOf(1000, 2000)),
            IterableCalories(listOf(3000))
        )
        val actual = FromInputListToCalories().transform(input)

        assertEquals(
            expected,
            actual
        )
    }
}