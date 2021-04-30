package nl.rstraub.kata.kotlin.bank.ocr

class InputParser {
    fun parse(input: String) = Numbers
        .values()
        .first { it.ascii in input }
        .value.toString()
}

enum class Numbers(val value: Int,val ascii: String) {
    ONE(1,ONE_ASCII),
    TWO(2,TWO_ASCII),
    SEVEN(7,SEVEN_ASCII)
}
const val ONE_ASCII =
    "   " +
    "  |" +
    "  |"
const val TWO_ASCII =
    " _ " +
    " _|" +
    "|_ "

const val SEVEN_ASCII =
    " _ " +
    "  |" +
    "  |"
