package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

enum class Choice(val value: Int, private val keys: List<Char>) {
    ROCK(1, listOf('A', 'X')),
    PAPER(2, listOf('B', 'Y')),
    SCISSORS(3, listOf('C', 'Z'));

    companion object {
        @JvmStatic
        fun from(choiceString: Char): Choice = values().first {
            choiceString in it.keys
        }
    }
}