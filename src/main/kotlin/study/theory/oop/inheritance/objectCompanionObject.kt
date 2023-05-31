package study.theory.oop.inheritance

class Matematica {

    // A diferença entre o 'companion object' e o 'object' é que
    // Ambos são inicializados quando acessados pela primeira vez
    //
    companion object {
        const val PI = 3.1415
        const val E = 2.7183
        fun teste(){}
        init {
            print("Fui inicializado")
        }
    }

    object obj1{
        init {
            print("Fui inicializado")
        }
    }
    object obj2{}

}

fun main() {

    // Vamos recriar as variáveis PI e E da classe Math
    Math.PI
    Math.E

    Matematica.PI
    Matematica.E
    Matematica.teste()
    val m = Matematica()

}