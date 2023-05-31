package study.theory.oop.inheritance

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

//fun mostraBonus(g: Gerente) {
//    println(g.bonus())
//}
fun mostraBonus(f: Funcionario) {
    // Eu poderia criar uma função para gerente e outra para analista
    // Mas vamos economizar código
    // Se eu implemento uma interface, eu vou implementar os comportamentos
    // Todas as classes filhas tem o comportamento 'bonus()'
    println(f.bonus())
}

fun main() {
    // Não faz sentido instanciar funcionário, pois ela foi criada para ser uma classe mãe
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(3000f))
}