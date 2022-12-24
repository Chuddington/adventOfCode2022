package com.github.chuddington.adventofcode.twentytwentytwo.daytwo

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.ChoiceWithResultSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter.MultiChoiceSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.utils.AdventOfCodeDay
import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.Logger

class DayTwo(private val logger: Logger) : AdventOfCodeDay {

    override fun part1(fileContents: List<String>) {
        val turns = MultiChoiceSplitter().split(fileContents)

        logger.info(
            logTag,
            "User score: ${turns.totalUserScore}"
        )
    }

    override fun part2(fileContents: List<String>) {
        val turns = ChoiceWithResultSplitter().split(fileContents)

        logger.info(
            logTag,
            "Updated User score: ${turns.totalUserScore}"
        )
    }
}