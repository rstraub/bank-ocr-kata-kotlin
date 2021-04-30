package nl.rstraub.kata.kotlin.bank.ocr

fun validate(accountNumber: String) = (accountNumber
    .chunked(1)
    .map(String::toInt)
    .reversed()
    .mapIndexed{ index, i -> i * (index + 1)  }
    .sum() % 11) == 0
