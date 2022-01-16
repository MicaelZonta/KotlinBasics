package chapter5.part7_static_companion_object

import java.time.Year

class ApenasUmaInstancia2 {
    companion object {
        private val anoAtual = Year.now().value

        fun qualAnoAtual() = "O ano é $anoAtual"
    }
}