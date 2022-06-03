fun obterMnemonica(cor: Cor) =
    when(cor){
        Cor.RED -> "Ver"
        Cor.YELLOW -> "Alguem"
        Cor.GREEN -> "Viver"
        Cor.BLUE -> "Alem e"
        Cor.ORANGE -> "Legal"
    }

fun obterTemp(cor: Cor) : String {
    return when(cor){
        Cor.RED, Cor.ORANGE, Cor.YELLOW -> "Quente"
        Cor.GREEN -> "Neutro"
        Cor.BLUE -> "Frio"
    }
}

fun main() {
    val mnemonica = obterMnemonica(Cor.RED)
    println(mnemonica)

    val temp = obterTemp(Cor.GREEN)

    println(temp)
}