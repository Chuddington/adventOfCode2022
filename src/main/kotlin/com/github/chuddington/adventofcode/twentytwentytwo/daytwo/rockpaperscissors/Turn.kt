package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

data class Turn(
    private val opponent: Choice,
    private val user: Choice
) {

    val opponentResult: Result = resultMap[user]?.get(opponent)!!
    val userResult: Result = resultMap[opponent]?.get(user)!!

    companion object {
        @JvmStatic
        private fun generateChoiceMap(
            drawChoice: Choice,
            lossChoice: Choice,
            winChoice: Choice,
        ) = mapOf(
            drawChoice to Result.Draw(drawChoice),
            lossChoice to Result.Loss(lossChoice),
            winChoice to Result.Win(winChoice)
        )

        @JvmStatic
        private val resultMap: Map<Choice, Map<Choice, Result>> = mapOf(
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