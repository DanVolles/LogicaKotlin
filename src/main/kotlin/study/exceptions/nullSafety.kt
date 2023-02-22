package study.exceptions

fun main() {

    val s: String? = null

    println(s?.length) // Pedir para o Kotlin tratar caso exista algum problema
    println(s!!.length) // Vamos assumir o erro ("eu tenho certeza que não tem nulls, mas se tiver, eu assumo o erro")

}
 /*
 Esse é o conceito de null safety -> no java, caso exista um problema com uma variável que dá NullPointerException,
 o programa vai travar, o que é negativo para a usabilidade do usuário.
 No Kotlin, esse problema vai ser tratado.
 Utilizando "?" como nos exemplos, você permite que um valor null seja instanciado (por default no kotlin isso
 não é possível). Utilizando "!!" você assume o erro de instanciar um valor null.
  */