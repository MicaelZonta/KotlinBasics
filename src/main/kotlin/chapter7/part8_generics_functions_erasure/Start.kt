package chapter7.part8_generics_functions_erasure

fun main(args: Array<String>) {

    val listaInt = mutableListOf(1, 2, 3, 4)
    print(listaInt)

}

fun <T: Number> print(lista: List<T>) {
    lista.forEach {
        println("${it.toInt()}")
    }
}
