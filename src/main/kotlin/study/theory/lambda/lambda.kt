package study.theory.lambda

/*
O que é lambda??
É uma função anônima
É uma função que pode ser passada como parâmetro
Como toda função, lambda tem retorno
 */

// { parâmetros -> corpo }

fun abc(x: Int) {

}

fun main() {

    val a = { println("Hello") }
    receiveA(a) // a é um dos lambdas mais simples que podemos fazer, é simplesmente um valor que pode ser executado

    receiveA { println("Olá, Mundo!") } // Outra possibilidade de declaração e execução dessa função

    val b = { x: Int -> x * x }
    receiveB(b)

    receiveB { x: Int -> x * x }

    val c = { x: Int, y: Int ->
        println("Executando")
        x * y // Esse é o retorno do lambda (textinho cinza)
    }
    c(5, 15)
    
    receiveC { b1, b2 ->
        print("Executando")
        b1 * b2
    }
    
}

// Essa função recebe um parâmetro que é uma função
fun receiveA(lambda: () -> Unit) {
    lambda()
}

fun receiveB(tt: (x: Int) -> Int) {

}

fun receiveC(lamb: (b1: Int, b2: Int) -> Int){

}