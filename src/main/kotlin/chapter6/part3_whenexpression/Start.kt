package chapter6.part3_whenexpression

import java.math.BigDecimal

fun main(args: Array<String>) {

    val num = 201

    when (num) {
        100, 600 -> println("100")
        in 200..250 -> println("200")
        300 -> println("300")
        400 -> println("400")
        500 -> println("500")
        else -> println("none")
    }


    val something: Any = 1

    val z = when (something) {
        is String -> {
            println(something)
            1
        }
        is BigDecimal -> {
            println(something.plus(BigDecimal(100)))
            2
        }
        is Int -> {
            println(something + 1)
            3
        }
        else -> {
            println("")
            4
        }
    }

    println(z)

}

