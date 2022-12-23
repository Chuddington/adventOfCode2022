package com.github.chuddington.adventofcode.twentytwentytwo.dayone.input.splitter

class LineSplitter(private val separator: String) {

    fun split(content: List<String>): List<List<String>> {
        val result = mutableListOf<List<String>>()

        val separatorIndexes = mutableListOf(content.size).also {
            it.addAll(content.mapIndexedNotNull { index, element ->
                index.takeIf { separator == element }
            })
        }.sorted()

            separatorIndexes.runningFold(0) { indexOne, indexTwo ->
                result.add(content.subList(indexOne, indexTwo))
                indexTwo + 1
            }

        return result
    }
}