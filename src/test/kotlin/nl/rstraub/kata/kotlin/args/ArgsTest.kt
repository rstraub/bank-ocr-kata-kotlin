package nl.rstraub.kata.kotlin.args

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class ArgsTest : StringSpec({
    "should return empty given zero arguments" {
        val result = Args() parse emptyList()

        result shouldBe emptyMap()
    }

    "should return true given a boolean flag" {
        val result = Args() parse listOf("-l")

        result shouldBe mapOf("-l" to true)
    }
})
