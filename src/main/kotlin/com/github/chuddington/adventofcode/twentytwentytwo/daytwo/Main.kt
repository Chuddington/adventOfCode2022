package com.github.chuddington.adventofcode.twentytwentytwo.daytwo

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader.FileInputReader
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter.LinesSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer.FromInputListToCalories
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.LineSplitter

fun main() {
    fun part1() {
        val inputReader = FileInputReader()
        val fileContents = inputReader.readInput("daytwo/puzzleInput.txt")
        val turns = LineSplitter(separator = "").split(fileContents)

        println("User score: ${turns.totalUserScore}")
    }

    fun part2() {
    }

    part1()
    println("\n")
    part2()
}
