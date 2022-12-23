package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

enum class RequiredResult(val value: Int, private val key: Char) {
    DRAW(3, 'Y'),
    LOSS(0, 'X'),
    WIN(6, 'Z');

    companion object {

        @JvmStatic
        fun from(key: Char): RequiredResult = values().first {
            it.key == key
        }
    }
}