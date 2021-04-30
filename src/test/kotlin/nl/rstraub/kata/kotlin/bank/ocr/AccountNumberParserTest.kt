package nl.rstraub.kata.kotlin.bank.ocr

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class AccountNumberParserTest : WordSpec({
    "parse" should {
        "convert multiple ascii numbers" {
            val input = "    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|" +
                        "                           "

            val result = AccountNumberParser().parse(input)

            result shouldBe "123456789"
        }
    }
})

