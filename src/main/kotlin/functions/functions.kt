package functions

/*
Tipos de retorno:
--> Unit
    --> Função não possui retorno
--> Double, Float, Long, Int, Short, Byte, Boolean, String, Char
--> Instancias de Classes
    --> A função retorna um tipo criado por nós
*/

// MAIN
fun main() {

    helloWorld("Danilo")

}

// HELLO WORLD
fun helloWorld(nome: String): String {

    // fun --> Declara que é uma função
    // helloWorld --> Nome da função
    // nome --> identificador
    // String --> tipo dos parâmetros
    // String --> tipo do retorno

    return "Olá, $nome!"
}

