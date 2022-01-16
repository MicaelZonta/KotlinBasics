package chapter5.part7_static_companion_object

import java.time.Year

class ApenasUmaInstancia {
    companion object teste{
        private val anoAtual = Year.now().value

        fun qualAnoAtual() = "O ano é $anoAtual"
    }
}