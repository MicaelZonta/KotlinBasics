package chapter5.part5_inheritance

open class ImpressoraLaser(modelo: String, val velocidade: String) : Impressora(modelo) {

    override fun printModelo() = println("Impressora Laser - $modelo $velocidade")
    override fun preco(): Double = 50.00
}