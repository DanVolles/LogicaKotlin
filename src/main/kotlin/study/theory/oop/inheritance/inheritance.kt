package study.theory.oop.inheritance

open class Eletronico(var marca: String) {
    private fun ativarCorrente() {}
    // Pode ser privado, por que não precisa ser acessado pelo computador
    fun ligar(){
        ativarCorrente()
    }
    fun desligar(){}
}

// Estou dizendo que o computador é um eletrônico
class Computador(marca: String): Eletronico (marca) {
    fun processar(){}
    fun instalarSoftware(){}
}

/*
Evite repetir códigos que fazem a mesma coisa
duplicar código é manutenção em dobro, problema em dobro
NÃO REPITA CÓDIGO
 */
fun main() {
    val computador = Computador("DELL")
    var geladeira = Eletronico("Brastemp")

    // Os métodos ligar() e desligar(), mesmo que não estejam definidos no escopo de "Computador"
    // Podem ser acessados pelo objeto "c"
    with(computador) {
        ligar()
        desligar()
        processar() // você não pode fazer um "g.processar()"
        instalarSoftware() // O mesmo vale para "g.instalarSoftware()"
        // ativarCorrente() // Não pode ser utilizado
    }
}