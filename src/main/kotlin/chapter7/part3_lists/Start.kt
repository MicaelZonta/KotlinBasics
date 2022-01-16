package chapter7.part3_lists


fun main(args: Array<String>) {

    val strings = listOf("A","B","C","D")
    val stringsMutable = strings.toMutableList()
    stringsMutable.add("E")

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    println(numbers)
    println(numbers[4])

    println(numbers.first())
    println(numbers.last())

    println(numbers.reversed())

    println(numbers.getOrNull(10))

    println(numbers.maxOrNull())

    val listacombinada = strings + numbers
    println(listacombinada)

    val listacombinadasemduplicados = strings.union(strings)
    println(listacombinadasemduplicados)

    val listacombinadaduplicados = strings  + strings
    println(listacombinadaduplicados)

    val listacombinadareremoveduplicados = listacombinadaduplicados.distinct()
    println(listacombinadareremoveduplicados)




}