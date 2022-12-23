package com.github.chuddington.adventofcode.twentytwentytwo.daytwo.rockpaperscissors

sealed class Result(
    private val resultValue: Int, private val choice: Choice
) {

    val value = resultValue + choice.value

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Result) {
            return false
        }

        val that: Result = other

        return this.resultValue == that.resultValue && this.choice == that.choice
    }

    override fun hashCode(): Int {
        var result = 17

        result = result * 31 + this.resultValue
        result = result * 31 + this.choice.hashCode()

        return result
    }

    override fun toString(): String =
        "Result(resultValue=$resultValue, choice=$choice)"

    class Draw(choice: Choice) : Result(3, choice)
    class Loss(choice: Choice) : Result(0, choice)
    class Win(choice: Choice) : Result(6, choice)
}
