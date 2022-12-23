package com.github.chuddington.adventofcode.twentytwentytwo.dayone.transformer

import com.github.chuddington.adventofcode.twentytwentytwo.dayone.Calories

class FromInputListToCalories {

    fun transform(input: List<List<String>>): List<Calories> = input.map { calorieStrings ->
        Calories(calorieStrings.map { it.toInt() })
    }
}