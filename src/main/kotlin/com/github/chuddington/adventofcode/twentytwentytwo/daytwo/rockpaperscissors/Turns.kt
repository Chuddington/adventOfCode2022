package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

data class Turns(private val turns: List<Turn>) {
    val totalUserScore = turns.sumOf {
        it.userResult.value
    }

    val totalOpponentScore = turns.sumOf {
        it.userResult.value
    }
}