package fileReading

import java.io.File
import java.io.InputStream

// Por meio de streams
fun streamFileReading(){
    val inputStream: InputStream = File("C:\\Users\\Danilo Volles\\IdeaProjects\\LogicaKotlin\\src\\main\\kotlin\\fileReading\\nomes.csv").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)
}

fun main() {
    streamFileReading()
}