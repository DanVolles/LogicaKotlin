package study.theory.functions

fun main() {

    // ENDEREÇO
    endereco("street", "city", "FL", "32802") // num: Int?
    endereco("street_2", "city_2", "FL", "32855", 15)
    // Mudança de ordem dos parâmetros.
    endereco(cidade = "cidade", estado = "estado", cep = "151515", rua = "nomeRua")

    // MEDIA
    println( media(10f, 8f, 9f)) // informar quantos parâmetros vc quiser

    // MÚLTIPLOS PARÂMETROS GENÉRICOS
    varParamGenericos("dasdas", 12, false, 23f, 3.14, 'c', "Danilo")
}

// Você pode determinar valores padrão para o argumento da função.
// O valor do argumento só precisa bater com o tipo.
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int? = null) {

}

// Você pode informar parâmetros
fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma/notas.size)
}

// Eu informo pra função que o tipo que ela está lidando é o <T>.
// Eu meio que crio o tipo na declaração da função.
// O vararg deve ser o último, caso existam múltiplas variáveis no sistema
fun <T> varParamGenericos(abc: String, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float){
            soma += n
        }
    }
    return (soma/notas.size)
}
















