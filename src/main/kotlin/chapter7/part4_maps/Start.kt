package chapter7.part4_maps


fun main(args: Array<String>) {

    val mapaCarro = mapOf(
        1 to Carro("Verde", "Teste", 1),
        2 to Carro("Vermelho", "Teste2", 2),
        3 to Carro("Cinza", "Teste3", 3)
    )

    val mapaCarroMutavel = mutableMapOf(
        "UM" to Carro("Verde", "Teste", 1),
        "DOIS" to Carro("Vermelho", "Teste2", 2),
        "TRES" to Carro("Cinza", "Teste3", 3)
    )

    mapaCarroMutavel["QUATRO"] = Carro("Cinza", "Teste3", 3)

    println(mapaCarro)
    println(mapaCarroMutavel)

}