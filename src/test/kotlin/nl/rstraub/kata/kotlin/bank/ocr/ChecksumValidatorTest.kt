package nl.rstraub.kata.kotlin.bank.ocr

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

internal class ChecksumValidatorTest : WordSpec({
    "validation" should {
        "return a valid result if the account number is valid" {
            val accountNumber = "345882865"
            validate(accountNumber) shouldBe true
        }
        "return an invalid result if the account number is invalid" {
            val accountNumber = "111111111"
            validate(accountNumber) shouldBe false
        }
    }
})
