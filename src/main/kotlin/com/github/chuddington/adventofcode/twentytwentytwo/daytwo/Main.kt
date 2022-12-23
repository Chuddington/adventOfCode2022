package com.github.chuddington.adventofcode.twentytwentytwo.daytwo

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader.FileInputReader
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.ChoiceWithResultSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.MultiChoiceSplitter

fun main() {
    fun part1(fileContents: List<String>) {
        val turns = MultiChoiceSplitter().split(fileContents)

        println("User score: ${turns.totalUserScore}")
    }

    fun part2(fileContents: List<String>) {
        val turns = ChoiceWithResultSplitter().split(fileContents)

        println("Updated User score: ${turns.totalUserScore}")
    }

    val inputReader = FileInputReader()
    val fileContents = inputReader.readInput("daytwo/puzzleInput.txt")

    part1(fileContents)
    part2(fileContents)
}
