package com.github.chuddington.adventofcode.twentytwentytwo.daytwo

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.ChoiceWithResultSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.MultiChoiceSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.utils.AdventOfCodeDay

class DayTwo : AdventOfCodeDay {

    override fun part1(fileContents: List<String>) {
        val turns = MultiChoiceSplitter().split(fileContents)

        println("User score: ${turns.totalUserScore}")
    }

    override fun part2(fileContents: List<String>) {
        val turns = ChoiceWithResultSplitter().split(fileContents)

        println("Updated User score: ${turns.totalUserScore}")
    }
}