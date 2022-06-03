import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    val porcentagem = porcentagem(100)
    println(porcentagem)

    val idade = lerIdade()
    println(idade)
}


fun porcentagem(numero: Int): String{
    return if (numero in 1..100){
        "$numero%"
    } else {
        throw IllegalAccessException("numero deve estar entre 1 e 100")
    }
}


fun lerIdade() : Int? {
    /*
    val reader = FileReader(File(pathname:"src/idades.txt"))
    val buffer = BufferedReader(reader)
     */

    try{
        val numero = readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException){
        return null
    } finally {
        readLine()
    }
}
 