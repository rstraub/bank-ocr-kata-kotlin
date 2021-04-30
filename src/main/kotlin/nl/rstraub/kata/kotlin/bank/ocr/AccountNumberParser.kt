package nl.rstraub.kata.kotlin.bank.ocr

class AccountNumberParser {
    private companion object {
        val AMOUNT_OF_ASCII_NUMBERS_PER_LINE = 9
        val ASCII_NUMBERS_PER_LINE_RANGE = 0..AMOUNT_OF_ASCII_NUMBERS_PER_LINE - 1
    }

    fun parse(input: String): String {
        return buildAsciiNumber(chonkize(input)).joinToString("", transform = NumberParser()::parse)
    }

    private fun buildAsciiNumber(numberChunks: List<String>) =
        ASCII_NUMBERS_PER_LINE_RANGE
            .map {
                numberChunks[it] +
                        numberChunks[it + AMOUNT_OF_ASCII_NUMBERS_PER_LINE] +
                        numberChunks[it + AMOUNT_OF_ASCII_NUMBERS_PER_LINE * 2]
            }

    private fun chonkize(input: String) = input
        .replace("\n", "")
        .chunked(3)

}
