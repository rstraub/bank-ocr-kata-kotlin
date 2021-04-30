package nl.rstraub.kata.kotlin.bank.ocr

class AccountNumberParser {
    private companion object {
        val AMOUNT_OF_ASCII_NUMBERS_PER_LINE = 9
        val ASCII_NUMBERS_PER_LINE_RANGE = 0..AMOUNT_OF_ASCII_NUMBERS_PER_LINE - 1
        val NUMBER_CHARACTERS_PER_LINE = 3
    }

    fun parse(input: String) = buildAsciiNumbers(input)
        .joinToString("", transform = NumberParser()::parse)

    private fun buildAsciiNumbers(numbers: String) =
        ASCII_NUMBERS_PER_LINE_RANGE
            .map { buildAsciiNumber(numbers, it) }

    private fun buildAsciiNumber(numbers: String, it: Int): String {
        val numberBlocks = asciiNumberBlocks(numbers)
        return numberBlocks[it] +
                numberBlocks[it + AMOUNT_OF_ASCII_NUMBERS_PER_LINE] +
                numberBlocks[it + AMOUNT_OF_ASCII_NUMBERS_PER_LINE * 2]
    }

    private fun asciiNumberBlocks(input: String) = input
        .replace("\n", "")
        .chunked(NUMBER_CHARACTERS_PER_LINE)

}
