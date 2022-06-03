fun main() {
    val porcentagem = porcentagem(100)
    println(porcentagem)
}


fun porcentagem(numero: Int): String{
    return if (numero in 1..100){
        "$numero"
    } else {
        throw IllegalAccessException("$numero deve estar entre 1 e 100")
    }
}

/*
fun lerIdade(): Int? {

}
 */