package com.github.chuddington.adventofcode.twentytwentytwo.dayone

data class Calories(private val items: Iterable<Int>) {

    val total: Int = items.sum()

    override fun toString(): String =
        "Calories(total=$total, items=$items)"
}