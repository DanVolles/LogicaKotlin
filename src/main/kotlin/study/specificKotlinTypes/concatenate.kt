package study.specificKotlinTypes

    fun main () {

        var name = "Danilo"
        var age = 26
        var role = "Programmer"

        // var message = "My name is " + name // --> funciona assim tbm
        var message = "My name is $name, I am $age years old and I am a $role"

        println(message)
    }