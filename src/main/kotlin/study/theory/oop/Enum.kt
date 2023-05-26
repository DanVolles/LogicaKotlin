package study.theory.oop

// A classe Enum limita os valores que podem ser passados como instâncias.
enum class PlanetasSistemaSolar{
    Mercurio, Venus, Terra, Marte,
    Jupiter, Saturno, Urano, Netuno
}

enum class Prioridade (val value: Int) {
    Baixa(1), Media(5), Alta(10)
}

fun translacao(p: PlanetasSistemaSolar){}

fun main() {
    PlanetasSistemaSolar.Mercurio
    PlanetasSistemaSolar.Terra
    PlanetasSistemaSolar.Saturno
    PlanetasSistemaSolar.Netuno
//  PlanetasSistemaSolar.Plutao // Não aceita criar esse objeto, por que ele não está no escopo dessa classe

//  translacao(PlanetasSistemaSolar.Ganimedes)
    translacao(PlanetasSistemaSolar.Venus)

    for (p in PlanetasSistemaSolar.values()){
        print("$p, ")
    }
    println()

    for (p in Prioridade.values()){
        print("$p, ${p.value}; ")
    }

}