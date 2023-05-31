package study.theory.oop.inheritance

interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event){
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso, conexões fechadas.")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Event{
        override fun onSuccess() {
            println("OnSuccess")
        }
    })
}

// Classe anônima é uma classe que não precisa ser criada no escopo do projeto,
// pois ela só será utilizada pontualmente em algum momento.
// Criamos um objeto do tipo 'Event' para não precisar criar uma classe de apoio.