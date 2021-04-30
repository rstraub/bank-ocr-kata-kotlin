package nl.rstraub.kata.kotlin.bank.ocr

class InputParser {
    fun parse(input: String) =
        if (SEVEN in input)
            "7"
        else
            "1"
}
const val ONE =
    "   " +
    "  |" +
    "  |"

const val SEVEN =
    " _ " +
    "  |" +
    "  |"
