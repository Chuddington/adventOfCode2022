package com.github.chuddington.adventofcode.twentytwentytwo.dayone

data class Calories(private val items: Iterable<Int>) {

    fun total(): Int = items.fold(0) { a, b -> a + b }
}