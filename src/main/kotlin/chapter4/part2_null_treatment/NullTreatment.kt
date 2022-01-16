package chapter4.part2_null_treatment

fun main(args: Array<String>) {

    val pessoa = Pessoa(null)

    if (pessoa.endereco?.nome == null) {
        println("Daria exception na Java")
    }

    var str : String? = null
    println(str!!.uppercase())

    val nullableInts = arrayOfNulls<Int?>(5)
}