package chapter7.part10_generic_covariance

class Jardim<out flor : Flor> {

    val flores = listOf<flor>()

    fun pegarFlor(i : Int): flor{
        return flores[i]
    }
}