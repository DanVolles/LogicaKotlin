package study.exceptions

fun main() {

    val s: String? = null

    s?.let {
        // o corpo será executado caso a variável s seja != de null
        // esse corpo é o scope function, é relativo à propria variável ("it")
        it.lowercase()
        it.length
    }

}

/*
Utilizar o let para realizar coisas caso a variável seja diferente de null.
ela substitui a estrutura:

if (str != null) {
    str.lowercase() // exemplo
    str.length // exemplo
}

 */