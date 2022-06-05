
class Casa2 {

    var cor: String = ""
    var vagasGaragem: Int = 0

    fun detalhesCasa(){
        println("A casa tem a cor: $cor, vagas: $vagasGaragem")
    }

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
    val casa = Casa2()
    casa.cor = "Vermelho"
    casa.vagasGaragem = 2

    casa.detalhesCasa()
}
