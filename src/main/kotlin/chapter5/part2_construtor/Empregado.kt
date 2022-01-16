package chapter5.part2_construtor

class Empregado constructor(primeiroNome: String) {

    val primeiroNome: String

    init {
        this.primeiroNome = primeiroNome
    }

}