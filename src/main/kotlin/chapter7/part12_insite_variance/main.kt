package chapter7.part12_insite_variance


fun main(args: Array<String>) {

    val carros1 = mutableListOf(Carro(), Carro())
    val carros2: MutableList<Carro> = mutableListOf()
    copiarCarros(carros1, carros2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copiarCarros(fords1, fords2)

    copiarCarros(fords1, carros2)

    val cars3: MutableList<Carro> = mutableListOf(Ford(), Ford())

}

fun <T: Carro> copiarCarros(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Carro {

}

class Toyota: Carro() {

}

class Ford: Carro() {

}