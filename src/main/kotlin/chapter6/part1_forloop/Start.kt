package chapter6.part1_forloop

fun main(args: Array<String>) {

    val range = 1..5

    for (i in range) {
        println(i)
    }

    range.forEach() {
        println(it)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"


    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCCC" in stringRange)
    println("ZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    for (i in backwardRange) {
        println(i)
    }

    val stepRange = 3..15
    val stepThree = stepRange.step(3)

    for (i in stepThree) {
        println(i)
    }


    val hello = "Hello"

    for (c in hello) {
        println(c)
    }

    for (num in 1..10 step 4) {
        println(num)
    }

    for (num in 1 until 10 step 4) {
        println(num)
    }

    for (num in 10 downTo 1 step 4) {
        println(num)
    }

    val teste = arrayOf("teste", "testeee", "testeeee", "testeeeee")
    for (item in teste) {
        println(item)
    }

    for (item in teste.indices) {
        println("${teste[item]} está na posição $item")
    }

    println("test" !in teste)


    for (a in 1..3) {
        println(a)
        bloop@ for (b in 1..4) {
            println(b)

            for (c in 1..5) {
                println(c)

                for (d in 1..6) {
                    println(d)

                    if (d == 3) {
                        break@bloop
                    }

                }
            }
        }
    }

}

