package study.theory.oop.lucasMontano

// O CONSTRUCTOR nasce com o objeto, então quando eu instancio um dog
// necessariamente eu tenho que passar o nome de um dono para ele
// Esse construtor é imutável
class Dog constructor(
    private var owner: Human // O parâmetro de construção desse objeto é um humano
){
    var name: String?  = null
    fun sayHi(){
        println("Hi, my name is $name and my owner is ${owner.name}")
    }

}