package study.dataStructures

fun main(args: Array<String>) {

    // Em um mesmo array eu posso definir itens de tipos diferentes --> byte + boolean + char + double
    // 1º item --> 0
    var shopList = arrayOf("Arroz", "Feijão", "Batata", 12, 15.56)

    println(shopList[3])
    println(shopList[1])

    println(shopList.contentToString()) // Lista todos os itens do array
    println(shopList.size)

}