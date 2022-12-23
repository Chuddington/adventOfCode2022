package com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.IterableCalories
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class IterableCaloriesTest {

    @ParameterizedTest(name = "{index}: {1} totals to {0}")
    @MethodSource("setupTotalCaloriesInputs")
    fun `total calories can be obtained`(
        expected: Int,
        caloriesList: List<Int>
    ) {
        val calories = IterableCalories(caloriesList)

        assertEquals(
            expected,
            calories.total
        )
    }

    companion object {

        @JvmStatic
        fun setupTotalCaloriesInputs(): Stream<Arguments> = Stream.of(
            Arguments.of(0, emptyList<Int>()),
            Arguments.of(3000, listOf(1000, 2000))
        )
    }
}