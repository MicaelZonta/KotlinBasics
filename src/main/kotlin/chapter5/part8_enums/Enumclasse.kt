package chapter5.part8_enums

enum class Enumclasse (val nomeExtenso:String, val index: Int){

    SP("São Paulo", 1),
    RJ("Rio De Janeiro", 2),
    MG("Minas Gerais", 3);


    fun info()="$nomeExtenso - $index"
}