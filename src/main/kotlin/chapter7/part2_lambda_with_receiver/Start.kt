package chapter7.part2_lambda_with_receiver


fun main(args: Array<String>) {

    println(contarAte100())

    val listaEmpregado = listOf(
        Empregado("Teste1", "teste5", 1),
        Empregado("Teste2", "teste6", 2),
        Empregado("Teste3", "teste7", 3),
        Empregado("Teste4", "teste8", 4)
    )

    println(procurarPorUltimoNome(listaEmpregado, "teste5"))

    "teste".apply teste@{
        "Teste2".apply {
            println(lowercase())
            println(this@teste.uppercase())
        }
    }
}

fun procurarPorUltimoNome(listaEmpregado: List<Empregado>, sobrenome: String): Empregado? {
    listaEmpregado.forEach lambda@{
        if (it.sobrenome == sobrenome) {
            return it;
            // return@lambda -> Retorno local
        }
    }
    return null
}

fun contarAte100(): String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99) {
            append("$i;")
        }
        append(100)
        toString()
    }
}

fun contarAte100Novamente() =
    StringBuilder().apply {
        for (i in 1..99) {
            append("$i;")
        }
        append(100)
    }.toString()


