package chapter5.part4_function_extension

fun main(args: Array<String>) {
    val carro1 = Carro("Azul")
    val carro2 = Carro("Vermelho")
    val carros = arrayOf(carro1, carro2)
    whatever(carro1, carro2)
    whatever(*carros)

}

fun whatever(vararg carros: Carro) {
    for (carro in carros) {
        println(carro.cor)
    }
}


class Carro(val cor: String = "Desconhecido") {
}