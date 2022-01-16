package chapter4.part1_arrays

fun main(args: Array<String>) {

    val nomes = arrayOf("teste", "teste1", "teste2")

    val longs = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    // Array Par
    var numerosPares = Array<Int?>(16) { i -> i * 2 }

    println(numerosPares[1])
    printarArray(numerosPares)
    // Array null
    var numerosParesNull = Array<Int?>(16) { null }

    //Array Misturado
    var misturado = arrayOf("oi", 1)


}

fun printarArray(vetor : Array<Int?> ) {
    for (num in vetor) {
        println(num)
    }
}