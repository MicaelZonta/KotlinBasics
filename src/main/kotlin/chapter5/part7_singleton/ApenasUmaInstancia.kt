package chapter5.part7_singleton

import java.time.Year

object ApenasUmaInstancia {

    val anoAtual = Year.now().value

    fun qualAnoAtual() = "O ano é $anoAtual"
}