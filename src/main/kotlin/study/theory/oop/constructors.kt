package study.theory.oop

// O método construtor está nas entranhas da classe
// inerente a declaração de uma classe temos o método construtor

// podemos deixar o método construtor privado
class Vazia private constructor() {
    var documento: String = ""
}

class Carro (val anoFabricacao: Int, val modelo: String){
    var doc: String? = null

    // Esse é o método construtor secundário
    constructor(anoFabricacao: Int, modelo: String, quilometragem: Int = 0, doc: String) : this(anoFabricacao, modelo) { // This se refere ao objeto
        this.doc = doc // O this puxa a variável DA CLASSE
        // Dentro do construtor pode ter lógica, if, else, while, etc.
    }
}

fun main() {

    // as vezes não preciso ter acesso a classe
    // A classe está aqui, mas não pode ser instanciada
//    Vazia()
//    Nothing()


}