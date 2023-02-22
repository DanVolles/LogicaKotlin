package study.exceptions

import kotlin.ArithmeticException

fun main() {

    try {

        val s: String? = null
        val a = 10/0

        println(s!!.length)

    } catch (e: NullPointerException) {
        println("Null value.")
    } catch (e: ArithmeticException) {
        println("Division by zero.")
    } catch (e: Exception) {
        println("Generic exception.")
    } finally {
        println("Finally.")
    }

    println("End.")

}

/*
O try catch funciona sem o finally
a e: Exception precisa necessariamente vir após o as outras exceptions conhecidas
 */