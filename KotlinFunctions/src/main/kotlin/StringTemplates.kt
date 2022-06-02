fun main() {
    val nome : String = "Douglas"

    println("Hello " + nome + "!")
    println("--------------------")
    println("Hello ${nome}!")
    println("--------------------")
    println("Hello $nome!")
    println("A soma a + b = ${sum(2, 5)}")
}

fun sum(a : Int, b : Int) : Int{
    return a.plus(b)
}