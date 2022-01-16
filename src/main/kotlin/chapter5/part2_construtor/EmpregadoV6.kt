package chapter5.part2_construtor

class EmpregadoV6 constructor(val primeiroNome: String, tempoIntegral: Boolean) {

    var tempoIntegral = tempoIntegral
        get() {
            return field
        }
        set(value) {
            field = value
        }


}