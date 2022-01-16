package chapter3.part2_equals

class Empregado(var nome: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Empregado) {
            return this.nome == obj.nome && this.id == obj.id
        }
        return false
    }
}