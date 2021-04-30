package nl.rstraub.kata.kotlin.bank.ocr

class InputParser {
    fun parse(input: String) = Numbers
        .values()
        .first { it.ascii in input }
        .value.toString()
}

enum class Numbers(val value: Int,val ascii: String) {
    ONE(1, ONE_ASCII),
    TWO(2, TWO_ASCII),
    THREE(3, THREE_ASCII),
    FOUR(4, FOUR_ASCII),
    FIVE(5, FIVE_ASCII),
    SIX(6, SIX_ASCII),
    SEVEN(7, SEVEN_ASCII),
    EIGHT(8, EIGHT_ASCII),
    NINE(9, NINE_ASCII)
}
const val ONE_ASCII =
    "   " +
    "  |" +
    "  |"
const val TWO_ASCII =
    " _ " +
    " _|" +
    "|_ "

const val FOUR_ASCII =
    "   " +
    "|_|" +
    "  | "
const val THREE_ASCII =
    " _ " +
    " _|" +
    " _| "

const val FIVE_ASCII =
    " _ " +
    "|_ " +
    " _| "

const val SIX_ASCII =
    " _ " +
    "|_ " +
    "|_| "
const val SEVEN_ASCII =
    " _ " +
    "  |" +
    "  |"
const val EIGHT_ASCII =
    " _ " +
    "|_|" +
    "|_| "
const val NINE_ASCII =
    " _ " +
    "|_|" +
    " _| "
