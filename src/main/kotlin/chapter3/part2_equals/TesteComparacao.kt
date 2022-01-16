package chapter3.part2_equals

fun main(args: Array<String>) {

    val empregado1 = Empregado("Teste", 1)
    val empregado2 = Empregado("TTT", 2)
    val empregado3 = Empregado("TTT", 2)
    val empregado4 = empregado2

    // Referencial
    println(empregado1 === empregado2)
    println(empregado2 === empregado3)
    println(empregado2 === empregado4)

    //Estrutural
    println(empregado1 == empregado2)
    println(empregado2 == empregado3)

    //Estrutural
    println(empregado1.equals(empregado2))
    println(empregado2.equals(empregado3))
}