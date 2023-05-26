package study.theory.oop

class Animal (val especie: String) {

    private var fala: String = ""
    init {
        // O bloco init (inicialização) vai ser executado quando a classe for criada
        print("Classe Animal criada")
    }
    init {
        // É possível ter dois ou mais inits
        // Eles são executados em ordem de criação
        if (especie == "cachorro") {
            fala = "au"
        } else if (especie == "gato") {
            fala = "miau"
        } else {
            fala = ""
        }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    // É possível declarar de uma forma mais densa, como essa
    val animal = Animal("cachorro")
    animal.falar()

    // Também é possível instanciar e já chamar o método da classe
    Animal("gato").falar()
}