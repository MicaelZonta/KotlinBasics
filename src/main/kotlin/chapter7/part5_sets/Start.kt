package chapter7.part5_sets


fun main(args: Array<String>) {

    val setInt = setOf(5, 10, 15, 20, 25)
    setInt.plus(30)
    println(setInt)
    println(setInt.plus(30))
    println(setInt.minus(5))
    println(setInt.drop(2))

    val setIntMutable = mutableSetOf(5, 10, 15, 20, 25)
    setIntMutable.add(30)
    println(setIntMutable)


}