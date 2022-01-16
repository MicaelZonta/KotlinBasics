package chapter7.part7_generics
import java.math.BigDecimal


fun main(args: Array<String>) {

    val listaString = mutableListOf("String", "AAAA", "BBBB")
    print(listaString)
    listaString.printExtension()

    val listBigDecimal = mutableListOf(BigDecimal(1), BigDecimal(2), BigDecimal(3))
    print(listBigDecimal)
    listBigDecimal.printExtension()

}

fun <T>print(lista: List<T>){
    lista.forEach{
        println(it)
    }
}

fun <T> List<T>.printExtension(){
    this.forEach{
        println(it)
    }
}


