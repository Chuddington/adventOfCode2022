package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.RequiredResult
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.ChoiceWithResultTurn
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.MultiChoiceTurn
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.Turns

class ChoiceWithResultSplitter() : Splitter {

    override fun split(content: List<String>): Turns = Turns(
        content.map {
            val splitTurnStrings = it.toCharArray()
            val opponentChoice = Choice.from(splitTurnStrings[0])
            val requiredResult = RequiredResult.from(splitTurnStrings[2])

            ChoiceWithResultTurn(opponent = opponentChoice, requiredResult = requiredResult)
        }.toList()
    )
}