package study.theory.oop.inheritance

// Herdar de uma classe abstrata exige que a classe seja abstrata
abstract class Mamifera (val nome: String){
    fun acordar(){}
    fun dormir(){}
    abstract fun falar() // A função abstrata não possui escopo, nem comportamentos
}
class Cachorro(nome: String) : Mamifera(nome) {
    // Como cachorro não é uma classe abstrata, é exigido que se sobrescreva
    // a função da classe mãe. Do contrário, Cachorro deveria, tbm, ser abstrata
    override fun falar() {
        TODO("Not yet implemented")
    }
}

fun main() {
//    val m = Mamifera() // A classe abstrata não é feita para ser instanciada.
    // Ela deve servir de molde para outras classes
}