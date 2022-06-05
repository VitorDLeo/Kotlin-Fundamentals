
class Casa {

    var cor: String = ""

    fun abrirJanela(){
        println("Janela Aberta")
    }
}

fun main() {

    val casa = Casa()
    casa.cor = "Vermelha"

    println(casa.abrirJanela())

}