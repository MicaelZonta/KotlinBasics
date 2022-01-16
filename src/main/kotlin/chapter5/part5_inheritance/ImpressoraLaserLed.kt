package chapter5.part5_inheritance

class ImpressoraLaserLed(modelo: String, velocidade: String, val caro: Boolean) : ImpressoraLaser(modelo, velocidade) {

    override fun printModelo() = println("Impressora Laser LED- $modelo $velocidade $caro")
}