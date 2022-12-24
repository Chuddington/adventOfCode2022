package com.github.chuddington.adventofcode.twentytwentytwo

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.DayOne
import com.github.chuddington.adventofcode.twentytwentytwo.daythree.DayThree
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.DayTwo
import com.github.chuddington.adventofcode.twentytwentytwo.utils.input.reader.FileInputReader
import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.Logger
import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.SystemLogger

fun main(args: Array<String>) {
    val inputReader = FileInputReader(logger)

    requireNotNull(
        argsToDay[args[0]]
    ).run {
        val fileContents = inputReader.readInput(puzzleInputFile())

        part1(fileContents)
        part2(fileContents)
    }
}

val logger: Logger = SystemLogger()

val argsToDay = mapOf(
    "one" to DayOne(logger),
    "two" to DayTwo(logger),
    "three" to DayThree(logger)
)