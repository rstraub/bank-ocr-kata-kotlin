package nl.rstraub.kata.kotlin.args

class Args {
    infix fun parse(arguments: List<String>): Map<String, Any> =
        if ("-l" in arguments)
            mapOf("-l" to true)
        else
            emptyMap()
}

fun main() {
    print("hello world")
}
