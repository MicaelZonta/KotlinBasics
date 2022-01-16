package chapter6.part4_trycatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    println(getNumber(null) ?: "NULO")

    println(getNumber("1") ?: throw IllegalArgumentException("Numero null"))


}

fun getNumber(str: String?): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException){
        null
    }finally {
        println("final")
    }
}

