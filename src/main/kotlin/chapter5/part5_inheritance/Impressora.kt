package chapter5.part5_inheritance


abstract class Impressora(val modelo: String){

    open fun printModelo() = println("Impressora normal - $modelo")
    abstract fun preco(): Double
}