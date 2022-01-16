package chapter5.part5_inheritance

fun main(args: Array<String>) {

    val impressora = ImpressoraLaser("alpha", "devagar")
    impressora.printModelo()
    val impressoraled = ImpressoraLaserLed("beta", "rapido", true)
    impressoraled.printModelo()


}

