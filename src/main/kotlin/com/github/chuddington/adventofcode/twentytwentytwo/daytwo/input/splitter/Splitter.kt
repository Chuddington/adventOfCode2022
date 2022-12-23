package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.input.splitter

import com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors.turns.Turns

interface Splitter {
    fun split(content: List<String>): Turns
}