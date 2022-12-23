package com.github.chuddington.adventofcode.twentytwentytwo.dayone

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.Calories
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader.FileInputReader
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter.LinesSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer.FromInputListToCalories

fun main() {
    fun part1(caloriesList: List<Calories>) {

        val maxCalories = caloriesList.maxBy(Calories::total)
        val maxCaloriesIndex = caloriesList.indexOf(maxCalories)

        println("Elf $maxCaloriesIndex has the most calories: $maxCalories")
    }

    fun part2(caloriesList: List<Calories>) {

        val topThreeCalories = caloriesList
            .sortedByDescending(Calories::total)
            .subList(0, 3)

        val totalThreeCalories = topThreeCalories.map(Calories::total).sum()

        println("Top 3 Calories: $topThreeCalories")
        println("Total calories: $totalThreeCalories")
    }

    val inputReader = FileInputReader()
    val fileContents = inputReader.readInput("dayone/puzzleInput.txt")
    val groupedContent = LinesSplitter(separator = "").split(fileContents)
    val caloriesList = FromInputListToCalories().transform(groupedContent)

    part1(caloriesList)
    println("\n")
    part2(caloriesList)
}
