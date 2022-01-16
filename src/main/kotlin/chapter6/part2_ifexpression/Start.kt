package chapter6.part2_ifexpression

fun main(args: Array<String>) {

    val condicao = 22 > 60

    println(
        if (condicao) {
            10
        } else {
            30
        }
    )

    val num = if (condicao) 50 else 20

    println(num)

}

