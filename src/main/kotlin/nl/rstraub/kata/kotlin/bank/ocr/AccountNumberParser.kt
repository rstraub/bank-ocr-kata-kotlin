package nl.rstraub.kata.kotlin.bank.ocr

class AccountNumberParser {
    private val AMOUNT_OF_LINES = 4
    private val CHARACTERS_PER_LINE = 27
    private val CHARACTERS_PER_NUMBER = 3
    private val NUMBERS_PER_LINE = CHARACTERS_PER_LINE / CHARACTERS_PER_LINE

    fun parse(input: String): String {
        val charLine = input
            .replace("\n", "")
        val numberChars = charLine.chunked(3)
        return (0..8).map{numberChars.get(it) + numberChars.get(it+9) + numberChars.get(it+18)}.map { NumberParser().parse(it) }.joinToString("")
    }

}
