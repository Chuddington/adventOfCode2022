package com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.calories.IterableCalories

class FromInputListToCalories {

    fun transform(input: List<List<String>>): List<IterableCalories> = input.map { calorieStrings ->
        IterableCalories(calorieStrings.map { it.toInt() })
    }
}