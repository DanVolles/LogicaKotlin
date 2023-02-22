package study.exercises.forWhilePack

/*
Enunciado:

Ana e Paula são duas programadoras na empresa X. Essa empresa benefício para incentivar os
funcionários a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor.
Ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100.
Este fundo de investimento possui rendimento de 0,2% ao mês.

Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria, já que
conhece investimentos que rendem mais do que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.

Considere o salário de Ana e Paula iguais e no valor de 10 mil reais.
As duas estão começando com saldo 0 e investirão 5% do salário.

Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
 */

fun main() {

    val salario = 10_000
    val percentualInvestimento = 0.05

    var investimentoAna = 0.00
    var investimentoPaula = 0.00

    val rendimentoAna = 0.002
    val rendimentoPaula = 0.008

    var mes = 0


    do {

        investimentoAna += (salario * percentualInvestimento) *2 + (investimentoAna * rendimentoAna)
        investimentoPaula += (salario*percentualInvestimento) + (investimentoPaula * rendimentoPaula)

        mes++

    } while (investimentoAna >= investimentoPaula)

    println("Paula terá o patrimônio maior do que o de Ana em $mes meses")

}