package com.github.chuddington.adventofcode.twentytwentytwo.dayone

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.Calories
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter.LinesSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer.FromInputListToCalories
import com.github.chuddington.adventofcode.twentytwentytwo.utils.AdventOfCodeDay

class DayOne : AdventOfCodeDay {

    override fun part1(fileContents: List<String>) {
        val groupedContent = LinesSplitter(separator = "").split(fileContents)
        val caloriesList = FromInputListToCalories().transform(groupedContent)

        val maxCalories = caloriesList.maxBy(Calories::total)
        val maxCaloriesIndex = caloriesList.indexOf(maxCalories)

        println("Elf $maxCaloriesIndex has the most calories: $maxCalories")
    }

    override fun part2(fileContents: List<String>) {
        val groupedContent = LinesSplitter(separator = "").split(fileContents)
        val caloriesList = FromInputListToCalories().transform(groupedContent)

        val topThreeCalories = caloriesList
            .sortedByDescending(Calories::total)
            .subList(0, 3)

        val totalThreeCalories = topThreeCalories.map(Calories::total).sum()

        println("Top 3 Calories: $topThreeCalories")
        println("Total calories: $totalThreeCalories")
    }
}