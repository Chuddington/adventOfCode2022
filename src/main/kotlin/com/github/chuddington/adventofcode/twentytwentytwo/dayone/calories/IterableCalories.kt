package com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories

data class IterableCalories(private val items: Iterable<Int>) : Calories {

    override val total: Int = items.sum()

    override fun toString(): String =
        "Calories(total=$total, items=$items)"
}