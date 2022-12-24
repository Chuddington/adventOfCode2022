package com.github.chuddington.adventofcode.twentytwentytwo.dayone

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.Calories
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter.LinesSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer.FromInputListToCalories
import com.github.chuddington.adventofcode.twentytwentytwo.utils.AdventOfCodeDay
import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.LogTagProvider
import com.github.chuddington.adventofcode.twentytwentytwo.utils.logging.Logger

class DayOne(private val logger: Logger) : AdventOfCodeDay {

    override fun part1(fileContents: List<String>) {
        val groupedContent = LinesSplitter(separator = "").split(fileContents)
        val caloriesList = FromInputListToCalories().transform(groupedContent)

        val maxCalories = caloriesList.maxBy(Calories::total)
        val maxCaloriesIndex = caloriesList.indexOf(maxCalories)

        logger.info(
            logTag,
            "Elf $maxCaloriesIndex has the most calories: $maxCalories"
        )
    }

    override fun part2(fileContents: List<String>) {
        val groupedContent = LinesSplitter(separator = "").split(fileContents)
        val caloriesList = FromInputListToCalories().transform(groupedContent)

        val topThreeCalories = caloriesList
            .sortedByDescending(Calories::total)
            .subList(0, 3)

        val totalThreeCalories = topThreeCalories.map(Calories::total).sum()

        logger.debug(
            logTag,
            "Top 3 Calories: $topThreeCalories"
        )

        logger.info(
            logTag,
            "Total calories: $totalThreeCalories"
        )
    }
}