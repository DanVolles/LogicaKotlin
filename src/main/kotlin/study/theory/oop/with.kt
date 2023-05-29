package study.theory.oop

fun main() {

    val pessoaCriadaParaExecucaoDeTestes = Pessoa(1985, "Frank")

    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    with(pessoaCriadaParaExecucaoDeTestes) {
        this.acordar()
        this.dormir()
    }

    /*
    Essa funcionalidade vale a pena quando se tem muitos métodos a chamar, ou então o nome
     da variável é muito grande. Ambas as formas estão certas/são possíveis,
     nós precisamos apenas identificar em que caso é a melhor solução.
     */

    val p = Pessoa(1996, "Danilo")
    p.dormir()
    p.acordar()

    with(p) {
        acordar()
        dormir()
        acordar()
        dormir()
        acordar()
        dormir()
        acordar()
        dormir()
        acordar()
        dormir()
    }

}