package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.Choice
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.MultiChoiceTurn
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.Turns
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class MultiChoiceSplitterTest {

    @ParameterizedTest(name = "{index}: {0} -> ({1}, {2})")
    @MethodSource("setupTurnData")
    fun `Converts string input into a turn`(
        inputString: String,
        opponentChoice: Choice,
        userChoice: Choice
    ) {
        val expected = Turns(
            listOf(
                MultiChoiceTurn(
                    opponent = opponentChoice,
                    user = userChoice
                )
            )
        )

        val actual = MultiChoiceSplitter().split(listOf(inputString))

        assertEquals(
            expected,
            actual
        )
    }

    companion object {
        @JvmStatic
        fun setupTurnData(): Stream<Arguments> = Stream.of(
            Arguments.of("A A", Choice.ROCK, Choice.ROCK),
            Arguments.of("A B", Choice.ROCK, Choice.PAPER),
            Arguments.of("A C", Choice.ROCK, Choice.SCISSORS),
            Arguments.of("A X", Choice.ROCK, Choice.ROCK),
            Arguments.of("A Y", Choice.ROCK, Choice.PAPER),
            Arguments.of("A Z", Choice.ROCK, Choice.SCISSORS),

            Arguments.of("B A", Choice.PAPER, Choice.ROCK),
            Arguments.of("B B", Choice.PAPER, Choice.PAPER),
            Arguments.of("B C", Choice.PAPER, Choice.SCISSORS),
            Arguments.of("B X", Choice.PAPER, Choice.ROCK),
            Arguments.of("B Y", Choice.PAPER, Choice.PAPER),
            Arguments.of("B Z", Choice.PAPER, Choice.SCISSORS),

            Arguments.of("C A", Choice.SCISSORS, Choice.ROCK),
            Arguments.of("C B", Choice.SCISSORS, Choice.PAPER),
            Arguments.of("C C", Choice.SCISSORS, Choice.SCISSORS),
            Arguments.of("C X", Choice.SCISSORS, Choice.ROCK),
            Arguments.of("C Y", Choice.SCISSORS, Choice.PAPER),
            Arguments.of("C Z", Choice.SCISSORS, Choice.SCISSORS),

            Arguments.of("X A", Choice.ROCK, Choice.ROCK),
            Arguments.of("X B", Choice.ROCK, Choice.PAPER),
            Arguments.of("X C", Choice.ROCK, Choice.SCISSORS),
            Arguments.of("X X", Choice.ROCK, Choice.ROCK),
            Arguments.of("X Y", Choice.ROCK, Choice.PAPER),
            Arguments.of("X Z", Choice.ROCK, Choice.SCISSORS),

            Arguments.of("Y A", Choice.PAPER, Choice.ROCK),
            Arguments.of("Y B", Choice.PAPER, Choice.PAPER),
            Arguments.of("Y C", Choice.PAPER, Choice.SCISSORS),
            Arguments.of("Y X", Choice.PAPER, Choice.ROCK),
            Arguments.of("Y Y", Choice.PAPER, Choice.PAPER),
            Arguments.of("Y Z", Choice.PAPER, Choice.SCISSORS),

            Arguments.of("Z A", Choice.SCISSORS, Choice.ROCK),
            Arguments.of("Z B", Choice.SCISSORS, Choice.PAPER),
            Arguments.of("Z C", Choice.SCISSORS, Choice.SCISSORS),
            Arguments.of("Z X", Choice.SCISSORS, Choice.ROCK),
            Arguments.of("Z Y", Choice.SCISSORS, Choice.PAPER),
            Arguments.of("Z Z", Choice.SCISSORS, Choice.SCISSORS),
        )
    }
}