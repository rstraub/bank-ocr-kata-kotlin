package nl.rstraub.kata.kotlin.args

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class ArgsTest: StringSpec({
    "canary" {
        true shouldBe false
    }
})
