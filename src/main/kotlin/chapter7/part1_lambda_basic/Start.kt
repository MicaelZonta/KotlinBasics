package chapter7.part1_lambda_basic


fun main(args: Array<String>) {

    run {
        println("lambda")
        topLevel()
    }

    val listaEmpregado = listOf(
        Empregado("Teste1", "teste1", 1),
        Empregado("Teste1", "teste1", 2),
        Empregado("Teste1", "teste1", 3),
        Empregado("Teste1", "teste1", 4)
    )

    println((listaEmpregado.minByOrNull { it.anoInicio }))

    var num = 10

    run {
        num += 15
        println(num)
    }

    run (::topLevel)
}


fun topLevel() = println("blabla")


