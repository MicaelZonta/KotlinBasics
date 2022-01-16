package chapter5.part2_construtor

val MINHA_CONSTANTE = 100

class EmpregadoV5 constructor(val primeiroNome: String) {

    var tempoIntegral : Boolean = true

    constructor(primeiroNome: String, tempoIntegral: Boolean) : this(primeiroNome) {
        this.tempoIntegral = tempoIntegral
    }

}