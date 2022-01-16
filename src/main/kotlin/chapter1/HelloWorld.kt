package chapter1

fun chamaArea() {
    println("Hello World!")
    area(largura = 10, altura = 10)
}

fun area(largura: Int, altura: Int) {
    println("Largura = $largura / Altura = $altura")
}

fun main(args: Array<String>) {
    chamaArea()
}