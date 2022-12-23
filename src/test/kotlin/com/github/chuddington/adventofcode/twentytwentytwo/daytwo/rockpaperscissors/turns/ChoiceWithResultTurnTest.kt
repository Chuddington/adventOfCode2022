package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.RequiredResult
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Result
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChoiceWithResultTurnTest {

    @Test
    fun `User wins`() {
        val turn = ChoiceWithResultTurn(
            opponent = Choice.ROCK,
            requiredResult = RequiredResult.WIN
        )

        assertEquals(
            Result.Win(Choice.PAPER).value,
            turn.userResultValue
        )
    }

    @Test
    fun `Draws`() {
        val choice = Choice.ROCK
        val expected = Result.Draw(choice).value

        val turn = ChoiceWithResultTurn(choice, RequiredResult.DRAW)

        assertEquals(
            expected,
            turn.userResultValue
        )
    }
}