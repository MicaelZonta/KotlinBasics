package chapter3.part1_declarations

typealias EmpregadoLista = Set<Empregado>

fun main(args: Array<String>) {

    //Como se fosse Final
    val numeroFinal = 0
    val numeroFinal2: Short = 1
    val numeroFinal3: Int

    //Como se fosse Variavel
    var numeroVariavel = 0
    var numeroVariavel2: Short = 1
    var numeroVariavel3: Int

    // Objetos
    val Empregado1 = Empregado("teste", 1)
    Empregado1.nome = "teste2"
    println(Empregado1.nome)

    //Alias para classe
    val Empregados: EmpregadoLista

    //Alias para classe
    val nomes = arrayListOf("Teste", "Teste22")
    println("O index 2 eh ${nomes[1]}")
    println(nomes[0])

    val caminho = """C:\Users\user\Documents\Java"""
    println(caminho)

    val texto = """C:\Users\user\Documents\Java
        *C:\Users\user\Documents\Java
        *C:\Users\user\Documents\Java
        *C:\Users\user\Documents\Java
    """.trimMargin("*")

    println(texto)


}

class Empregado(var nome: String, val id: Int) {

}