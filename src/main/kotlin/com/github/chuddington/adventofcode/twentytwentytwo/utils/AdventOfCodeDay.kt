package com.github.chuddington.adventofcode.twentytwentytwo.utils

import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.LogTagProvider

interface AdventOfCodeDay : LogTagProvider {
    val resourceFolder: String
        get() = this::class.java.simpleName.lowercase()

    fun exampleInputFile(): String = "$resourceFolder/exampleInput.txt"
    fun puzzleInputFile(): String = "$resourceFolder/puzzleInput.txt"

    fun part1(fileContents: List<String>)
    fun part2(fileContents: List<String>)
}