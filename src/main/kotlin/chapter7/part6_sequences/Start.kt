package chapter7.part6_sequences

import chapter7.part4_maps.Carro


fun main(args: Array<String>) {

    val mapaCarro = mapOf(
        1 to Carro("Verde", "Teste", 1),
        2 to Carro("Vermelho", "Teste2", 2),
        3 to Carro("Cinza", "Teste3", 3)
    )

    val sequencia = mapaCarro.asSequence()
    println(sequencia.first())

    val strings = listOf("AA","BA","CA","DA","AB","BB","CB","DB")

    val sequencia2 = strings.asSequence()


    var listaFinal = listOf(sequencia2.filter {
        println("Filtrando $it")
        it[0] == 'D'
    }.map {
        println("Mapeando $it")
        it.lowercase()
    }.toList())

    println(listaFinal)


}