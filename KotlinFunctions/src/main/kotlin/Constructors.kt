
class Casa2( cor : String, vagasGaragem : Int ) {

    var cor: String
    var vagasGaragem: Int

    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

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
    val casa = Casa2("Amarelo", 3)
    val casa3 = Casa2("Cinza", 10)
    // casa.cor = "Vermelho"
    // casa.vagasGaragem = 2
    // casa.detalhesCasa()

    casa.detalhesCasa()
    casa3.detalhesCasa()
}
