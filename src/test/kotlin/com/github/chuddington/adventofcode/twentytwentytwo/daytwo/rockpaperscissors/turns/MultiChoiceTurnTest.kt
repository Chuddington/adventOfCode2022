package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Result
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MultiChoiceTurnTest {

    @Test
    fun `User wins`() {
        val multiChoiceTurn = MultiChoiceTurn(opponent = Choice.ROCK, user = Choice.PAPER)

        assertEquals(
            Result.Win(Choice.PAPER).value,
            multiChoiceTurn.userResultValue
        )
    }

    @Test
    fun `Draws`() {
        val choice = Choice.ROCK
        val expected = Result.Draw(choice).value

        val multiChoiceTurn = MultiChoiceTurn(choice, choice)

        assertEquals(
            expected,
            multiChoiceTurn.userResultValue
        )
    }
}