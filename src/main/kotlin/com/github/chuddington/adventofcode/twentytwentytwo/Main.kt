package com.github.chuddington.adventofcode.twentytwentytwo

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.DayOne
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.DayTwo
import com.github.chuddington.adventofcode.twentytwentytwo.utils.input.reader.FileInputReader

fun main(args: Array<String>) {
    val inputReader = FileInputReader()

    requireNotNull(
        argsToDay[args[0]]
    ).run {
        val fileContents = inputReader.readInput(puzzleInputFile())

        part1(fileContents)
        println("\n")
        part2(fileContents)
    }
}

val argsToDay = mapOf(
    "one" to DayOne(),
    "two" to DayTwo()
)