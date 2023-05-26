package study.theory.specificKotlinTypes

// Any, Unit, Nothing

fun main() {

}

fun valores(values: Any): Unit {
// ANY
    // Qualquer tipo de dado pode ser inserido como argumento dessa função.
    // A nível de POO, Any é a classe mãe de todos os outros tipos de dado existentes no kotlin.
    // Boolean, Int, Long, Double, Char, tudo isso descende do tipo Any.
    // Similar ao generic, mas a nível de POO, tem diferença

// UNIT
    // Tipo de função que não fornece retorno
    // Declarar é opcional
    // Por default, uma função é Unit
}

fun tipoNothing(values: Any): Nothing {
    // É um nada
    // Utilizado comumente para excessões

    // Método TODO
    // serve para indicar que a função existe mas ainda não foi implementada.
    TODO("Não implementado") // O TODO é uma função do tipo Nothing

    // É incomum uma função do tipo Nothing por que não tem como retornar nada, a não ser que seja uma exceção
}
