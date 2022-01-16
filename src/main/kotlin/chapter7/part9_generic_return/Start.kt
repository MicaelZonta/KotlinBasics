package chapter7.part9_generic_return

import java.math.BigDecimal


fun main(args: Array<String>) {

    val listaString = mutableListOf("String", BigDecimal(1), "BBBB", BigDecimal(3))

    val listaBigDecimal = returnItemsOfType<BigDecimal>(listaString)

    if(listaBigDecimal is MutableList){
        listaBigDecimal.add(BigDecimal(666))
    }

    println(listaBigDecimal)

}

inline fun <reified T> returnItemsOfType(lista: List<Any>): List<T> {
    val listaDesejada: MutableList<T> = mutableListOf()

    lista.forEach {
        if (it is T) {
            listaDesejada.add(it)
        }
    }
    return listaDesejada
}