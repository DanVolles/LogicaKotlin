package study.theory.oop.inheritance

open class Eletronico2 (var marca: String){
    private fun corrente(ativo: Boolean){}
    fun ligar() {
        corrente(true)
    }
    open fun desligar(){
        // Essa função precisa ser open,
        corrente(false)
    }
}

class Computador2 (marca: String): Eletronico2(marca) {
//    fun desligarComputador(){ // Fica confuso,não é uma boa
//        save()
//        desligar()
//    }
    override fun desligar(){
        save()
        super.desligar() // Esse desligar é o desligar do Eletrônico
    }

    fun save() {}
    fun save(a: Int){} // É possível, já que as assinaturas estão diferentes
    fun save(b: Boolean){} // Idem

}

fun main() {
    val c: Computador2 = Computador2("DELL")

    with(c) {
        this.ligar()
        this.desligar()
    }
}