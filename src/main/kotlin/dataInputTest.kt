fun main() {
    val s = readLine()
    println(s)

    // O s não pode ser null, nem uma string vazia para que se possa converter o tipo
    if (s != null && s != "") {
        s.toInt()
        s.toFloat()
        s.toBoolean()
    }
}