package nl.rstraub.kata.kotlin.bank.ocr

class InputParser {
    fun parse(input: String) =
        if ("_" in input)
            "7"
        else
            "1"
}
