class Pessoa(
    val nome : String,
    val age : Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Douglas", 28)
    val pessoa2: Pessoa = Pessoa("Vitor", 31)

    println("Pessoa 1 = ${pessoa1.nome}... idade = ${pessoa1.age}")
    println("Pessoa 2 = ${pessoa2.nome}... idade = ${pessoa2.age}")
}