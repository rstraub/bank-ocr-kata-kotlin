package nl.rstraub.kata.kotlin.bank.ocr

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class InputParserTest : WordSpec({
    "parse" should {
        "convert an entry for one to a one" {
            val input = """
            
            |
            |
            
        """.trimIndent()

            InputParser().parse(input) shouldBe "1"
        }
        "convert an entry for a seven to a seven" {
            val input = """
                _
                 |
                 |
                 
            """.trimIndent()
            InputParser().parse(input) shouldBe "7"
        }
    }
})
