package microProjects.portariaMiniProjetoPOO

// Responsabilidade --> Ler informações.
// Quando pede a informação, ele vai tratar e retornar algo pronto para uso.
// Essa classe tem private constructor por que eu não quero que essa classe seja instanciada.
// Para eu poder utilizar as funções dela sem instanciar, eu preciso usar o companion object.
class Console private constructor(){
    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null
            do {
                print(msg)
                val info = readln()

                if (info != ""){
                    retorno = info.toIntOrNull()
                    if (retorno == null || retorno <= 0) {
                        println("Valor inválido.")
                    }
                }
            } while (retorno == null || retorno <= 0)

            return 0
        }

        fun readString(msg: String): String {
            var retorno: String? = null
            do {
                print(msg)
                val info = readLine()
                if (info != null || info != "") {
                    if (info != null) {
                        retorno = info.lowercase()
                    }
                } else {
                    println("Valor inválido.")
                }
            } while (retorno == null)
            return retorno
        }
    }

}