package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.RequiredResult
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Result

data class ChoiceWithResultTurn(
    private val opponent: Choice,
    private val requiredResult: RequiredResult
) : Turn {

    override val userResultValue: Int = resultMap[opponent]?.get(requiredResult)!!.value

    companion object {
        @JvmStatic
        private fun generateChoiceMap(
            drawChoice: Choice,
            lossChoice: Choice,
            winChoice: Choice,
        ) = mapOf(
            RequiredResult.DRAW to Result.Draw(drawChoice),
            RequiredResult.LOSS to Result.Loss(lossChoice),
            RequiredResult.WIN to Result.Win(winChoice)
        )

        @JvmStatic
        private val resultMap: Map<Choice, Map<RequiredResult, Result>> = mapOf(
            Choice.ROCK to generateChoiceMap(
                drawChoice = Choice.ROCK,
                lossChoice = Choice.SCISSORS,
                winChoice = Choice.PAPER
            ),
            Choice.PAPER to generateChoiceMap(
                drawChoice = Choice.PAPER,
                lossChoice = Choice.ROCK,
                winChoice = Choice.SCISSORS
            ),
            Choice.SCISSORS to generateChoiceMap(
                drawChoice = Choice.SCISSORS,
                lossChoice = Choice.PAPER,
                winChoice = Choice.ROCK
            )
        )
    }
}