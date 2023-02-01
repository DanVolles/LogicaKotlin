package study.exercises

import java.util.*

var sc = Scanner(System.`in`)

fun main() {

    println("Digite o cargo do colaborador.")
    var cargo = sc.next()
    println("Digite o tempo de contrato do colaborador (em meses)")
    var tempo = sc.nextInt()
    var output = bonus(cargo, tempo)
    println(output)

}

fun bonus(cargo: String, tempo: Int): Int {
    var adicional = 0
    if (cargo == "estagiario" && tempo != 0) {
        return 500
    } else if (cargo == "engenheiro de software" && tempo != 0) {
        return 1_000
    } else if (cargo == "coordenador") {
        adicional = if (tempo >= 12)
            1_800
        else
            1_500
    } else if (cargo == "gerente") {
        adicional = if (tempo >= 24)
            3_000
        else
            2_000
    }
    return adicional
}

// --- Primeira resolução
/*
var sc = Scanner (System.`in`)

fun main() {

    println("Forneça o cargo do funcionário para informarmos o bônus que ele receberá." +
            "\nDigite: 1 para estagiário, 2 para eng. de Software, 3 para coordenador e 4 para Gerente.")
    var cargo = sc.nextInt()
    println("Informe a quanto tempo (em meses) esse funcionário trabalha na empresa.")
    var tempo = sc.nextInt()

    if (cargo == 1) {
        println("O estagiário receberá R$500 de bônus")
    } else if (cargo == 2) {
        println("O engenheiro de software receberá R$1000 de bônus")
    } else if (cargo == 3) {
        if (tempo >= 12) {
            println("O coordenador com mais de um ano de casa recebe R$1800 de bônus")
        } else {
            println("O coordenador com menos de um ano de casa recebe R$1500 de bônus")
        }
    } else if (cargo == 4) {
        if (tempo >= 24) {
            println("O gerente com mais de dois anos de casa recebe R$3000 de bônus")
        } else {
            println("O gerente com menos de dois anos de casa recebe R$2000 de bônus")
        }
    }
 */