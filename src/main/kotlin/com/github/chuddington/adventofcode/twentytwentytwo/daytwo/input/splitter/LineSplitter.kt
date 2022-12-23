package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Turn
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Turns

class LineSplitter(private val separator: String) {

    fun split(content: List<String>): Turns = Turns(
        content.map {
            val splitTurnStrings = it.toCharArray()
            val opponentChoice = Choice.from(splitTurnStrings[0])
            val userChoice = Choice.from(splitTurnStrings[2])

            Turn(opponent = opponentChoice, user = userChoice)
        }.toList()
    )
}