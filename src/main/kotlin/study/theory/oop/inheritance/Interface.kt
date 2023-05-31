package study.theory.oop.inheritance

// Uma interface não tem como objetivo ser instanciada, mas sim, ser implementada
// Você implementa uma interface para utilizar seus métodos
interface Selvagem {
    fun atacar () {
        print("abc")
    }
}
abstract class Mamifero (val nome: String){
    fun acordar () {}
    fun dormir () {}
    abstract fun falar()
}
class Dog (nome: String) : Mamifero (nome), Selvagem {
    /* Não existe herança múltipla, uma classe apenas herda outra
    // Dog não pode ser Mamífero e Selvagem - A não ser que td mamífero seja selvagem
    // Mas esse não é o objetivo. */
    override fun falar() {
        TODO("Not yet implemented")
    }
}

fun main() {

}