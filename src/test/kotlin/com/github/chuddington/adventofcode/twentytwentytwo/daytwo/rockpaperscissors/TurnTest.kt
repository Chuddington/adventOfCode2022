package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TurnTest {

    @Test
    fun `User wins`() {
        val turn = Turn(opponent = Choice.ROCK, user = Choice.PAPER)

        assertEquals(
            Result.Win(Choice.PAPER),
            turn.userResult
        )

        assertEquals(
            Result.Loss(Choice.ROCK),
            turn.opponentResult
        )
    }

    @Test
    fun `Draws`() {
        val choice = Choice.ROCK
        val expected = Result.Draw(choice)

        val turn = Turn(choice, choice)

        assertEquals(
            expected,
            turn.userResult
        )

        assertEquals(
            expected,
            turn.opponentResult
        )
    }
}