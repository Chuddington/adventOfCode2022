package com.github.chuddington.adventofcode.twentytwentytwo.dayone

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.reader.FileInputReader
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter.LineSplitter
import com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer.FromInputListToCalories

fun main() {
    fun part1() {
        val inputReader = FileInputReader()
        val fileContents = inputReader.readInput("dayone/puzzleInput.txt")
        val groupedContent = LineSplitter(separator = "").split(fileContents)
        val caloriesList = FromInputListToCalories().transform(groupedContent)

        caloriesList.forEachIndexed { index, calories ->
            println("Elf $index holds ${calories.total} total calories.")
        }

        val maxCalories = caloriesList.maxBy(Calories::total)
        val maxCaloriesIndex = caloriesList.indexOf(maxCalories)

        println("\n\nElf $maxCaloriesIndex has the most calories: $maxCalories")
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    part1()
}
