package study.theory.oop.lucasMontano

fun main() {

    val danilo = Human()
    danilo.name = "Danilo Volles"
    val andressa = Human()
    andressa.name = "Andressa Adelaide"

    val dogDan = Dog(danilo)
    // val dogDan = Dog(andressa) // Por causa do construtor, você não pode mudar o dono
    dogDan.name = "Linux"
    dogDan.sayHi()

    val dogDel = Dog(andressa)
    dogDel.name = "Android"
    dogDel.sayHi()

}