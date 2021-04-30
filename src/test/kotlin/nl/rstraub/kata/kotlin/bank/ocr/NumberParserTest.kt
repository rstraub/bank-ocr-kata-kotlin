package nl.rstraub.kata.kotlin.bank.ocr

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class NumberParserTest : WordSpec({
    "parse" should {
        "convert an entry for one to a one" {
            val input =
                "   " +
                "  |" +
                "  |" +
                "   "

            NumberParser().parse(input) shouldBe "1"
        }
        "convert an entry for a two to a two" {
            val input =
                " _ " +
                " _|" +
                "|_ " +
                "   "

            NumberParser().parse(input) shouldBe "2"
        }

        "convert an entry for a three to a three" {
            val input =
                " _ " +
                " _|" +
                " _| " +
                "   "

            NumberParser().parse(input) shouldBe "3"
        }
        "convert an entry for a four to a four" {
            val input =
                "   " +
                "|_|" +
                "  | " +
                "   "

            NumberParser().parse(input) shouldBe "4"
        }
        "convert an entry for a five to a five" {
            val input =
                " _ " +
                "|_ " +
                " _| " +
                "   "

            NumberParser().parse(input) shouldBe "5"
        }
        "convert an entry for a six to a six" {
            val input =
                " _ " +
                "|_ " +
                "|_|" +
                "   "

            NumberParser().parse(input) shouldBe "6"
        }
        "convert an entry for a seven to a seven" {
            val input =
                " _ " +
                "  |" +
                "  |" +
                "   "

            NumberParser().parse(input) shouldBe "7"
        }
        "convert an entry for a eight to a eight" {
            val input =
                " _ " +
                "|_|" +
                "|_|" +
                "   "

            NumberParser().parse(input) shouldBe "8"
        }
        "convert an entry for a nine to a nine" {
            val input =
                " _ " +
                "|_|" +
                " _|" +
                "   "

            NumberParser().parse(input) shouldBe "9"
        }
        "convert an entry for a zero to a zero" {
            val input =
                " _ " +
                "| |" +
                "|_|" +
                "   "

            NumberParser().parse(input) shouldBe "0"
        }
    }
})
