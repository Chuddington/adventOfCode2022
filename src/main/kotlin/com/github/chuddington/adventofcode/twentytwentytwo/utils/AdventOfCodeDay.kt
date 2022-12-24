package com.github.chuddington.adventofcode.twentytwentytwo.utils

interface AdventOfCodeDay {
    val resourceFolder: String
        get() = this::class.java.simpleName.lowercase()

    fun exampleInputFile(): String = "$resourceFolder/exampleInput.txt"
    fun puzzleInputFile(): String = "$resourceFolder/puzzleInput.txt"

    fun part1(fileContents: List<String>)
    fun part2(fileContents: List<String>)
}