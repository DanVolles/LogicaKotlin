package study.theory.oop

// TODO objeto tem equals, toString e hashCode

fun main() {
    val f1 = FormaData(10, 8)
    val f2 = FormaData(10, 8)
    println(f1.toString())
    println(f1.hashCode())
//    println(f1.equals(f2))
    print(f1 == f2)
    // o equals compara endereços de memória
    // f1 e f2 estão em endereços de memória diferentes


}
class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}

/*
O data class é uma classe com a lógica anterior,
de determinar que, se dois objetos possuem os mesmos parâmetros,
ambos os objetos são iguais
*/
data class FormaData(val a:Int, val b: Int) // Esse construtor precisa do "val"
