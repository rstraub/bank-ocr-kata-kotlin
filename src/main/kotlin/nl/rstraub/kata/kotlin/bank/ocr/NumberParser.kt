package nl.rstraub.kata.kotlin.bank.ocr

class NumberParser {
    fun parse(input: String) = Numbers
        .values()
        .first { it.ascii in input }
        .value.toString()
}

private enum class Numbers(val value: Int,val ascii: String) {
    ONE(1, ONE_ASCII),
    TWO(2, TWO_ASCII),
    THREE(3, THREE_ASCII),
    FOUR(4, FOUR_ASCII),
    FIVE(5, FIVE_ASCII),
    SIX(6, SIX_ASCII),
    SEVEN(7, SEVEN_ASCII),
    EIGHT(8, EIGHT_ASCII),
    NINE(9, NINE_ASCII),
    ZERO(0,ZERO_ASCII)
}
private const val ONE_ASCII =
    "   " +
    "  |" +
    "  |"
private const val TWO_ASCII =
    " _ " +
    " _|" +
    "|_ "

private const val FOUR_ASCII =
    "   " +
    "|_|" +
    "  | "
private const val THREE_ASCII =
    " _ " +
    " _|" +
    " _| "

private const val FIVE_ASCII =
    " _ " +
    "|_ " +
    " _| "

private const val SIX_ASCII =
    " _ " +
    "|_ " +
    "|_| "
private const val SEVEN_ASCII =
    " _ " +
    "  |" +
    "  |"
private const val EIGHT_ASCII =
    " _ " +
    "|_|" +
    "|_| "
private const val NINE_ASCII =
    " _ " +
    "|_|" +
    " _| "

private const val ZERO_ASCII =
    " _ " +
    "| |" +
    "|_| "
