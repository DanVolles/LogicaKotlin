package microProjects.portariaMiniProjetoPOO

class Portaria {

    fun controle() {
        val idade = Console.readInt("Qual a sua idade? ")
        if (idade < 18) {
            println("Negado. Menores não permitidos.")
            return
        }
        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        println(tipoConvite)
    }
}