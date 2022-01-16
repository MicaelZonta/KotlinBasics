package chapter5.part4_function_extension

fun main(args: Array<String>) {

    var str = "str"
    println(str.adicionarUmaLetraNoFinal())
}


inline fun String.adicionarUmaLetraNoFinal() : String {
    return this + "teste"
}