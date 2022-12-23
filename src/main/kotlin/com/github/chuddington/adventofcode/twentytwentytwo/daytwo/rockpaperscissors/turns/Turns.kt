package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns

data class Turns(private val turns: List<Turn>) {
    val totalUserScore = turns.sumOf {
        it.userResultValue
    }
}