package study.theory.oop

    // Primeira letra maiúscula
    // Agrupa comportamentos e atributos
    // Consegue gerar vários objetos // Uma classe instancia objetos
class Pessoa(val anoNascimento: Int = 2023, var nome: String){
    // Preciso assinalar o tipo da variável (var/val) para poder acessar isso ao longo do programa

        var olhos: String = ""
        fun dormir(){

        }
        fun acordar(){

        }

}


fun main() {
    //  nomeVar: TipoVar = Instancia()
    var pessoa: Pessoa = Pessoa(1996, "Danilo")

    pessoa.nome // O ponto nos permite acessar atributos ou métodos de um objeto
    println(pessoa.nome) // output: Danilo

    pessoa.acordar()
    pessoa.dormir()
}