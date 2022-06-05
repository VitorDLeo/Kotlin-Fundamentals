
class Casa {

    var cor: String = ""

    fun abrirJanela(qtdJanelas: Int){
        println("Quantidade de janelas aberta: $qtdJanelas")
    }

    fun abrirPorta(){
        println("Porta aberta!!")
    }

    fun abrirCasa(){
        // this.abrirJanela()
        this.abrirPorta()
    }

}

fun main() {

    val casa = Casa()
    casa.cor = "Vermelha"

    println(casa.abrirJanela(4))

    println(casa.abrirCasa())

}