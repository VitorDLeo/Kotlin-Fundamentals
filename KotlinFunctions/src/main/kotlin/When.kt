fun obterMnemonica(cor: Cor) =
    when(cor){
        Cor.RED -> "Ver"
        Cor.YELLOW -> "Alguem"
        Cor.GREEN -> "Viver"
        Cor.BLUE -> "Alem e"
        Cor.ORANGE -> "Legal"
    }

fun main() {
    val mnemonica = obterMnemonica(Cor.RED)
    println(mnemonica)
}