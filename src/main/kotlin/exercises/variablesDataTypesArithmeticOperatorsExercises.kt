package exercises

/*
 *  Crie um programa
 *-     a. arquivo com função main
 *-     b. declare variavel mutável capaz de armazenar nome completo
 *-     c. declare variável de texto sem valor
 *-     d. declare ma variavel imutavel com o menor tipo de dado possível capaz de armazenar o numero que vc calça
 *      e. declare uma variavel capaz de armazenar o pib do Brasil (1_869_000_000_000)
 *      f. declare uma variavel capaz de armazenar a população do Brasil (211_000_000)
 *      g. imprima o valor do pib per capita
 *      h. Rodar programa sem erros
 */

fun main() {

    var nomeCompleto = "Danilo Volles Araujo"
    var texto: String
    val calcado: Byte = 42

    val pibBrasil = 1_869_000_000_000
    val populacaoBrasil = 211_000_000

    var pibPerCapita = pibBrasil/populacaoBrasil

    println("O meu nome completo é $nomeCompleto e eu calço $calcado.")
    println("O PIB per capita do Brasil é $pibPerCapita R$/pessoa.")


}