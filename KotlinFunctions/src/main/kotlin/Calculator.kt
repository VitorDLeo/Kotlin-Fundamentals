import java.util.Scanner

fun soma (a : Double, b : Double) : Double {
    var soma = a + b
    return soma
}

fun sub (a : Double, b : Double) : Double {
    var sub = a - b
    return sub
}

fun mult (a : Double, b : Double) : Double {
    var mult = a * b
    return mult
}

fun div (a : Double, b : Double) : Double {
    var div = a / b
    return div
}

fun main() {

    val reader = Scanner(System.`in`)

    println("""
        Bem vindo a calculadora em Kotlin
        Escolha a sua opcao
        ---------------------------
        [ 1 ] SOMA
        [ 2 ] SUBTRACAO
        [ 3 ] MULTIPLICACAO
        [ 4 ] DIVISAO
        ---------------------------
    """.trimIndent())
    
    val opt : Int = reader.nextInt()
    print("Escolha o valor de a: ")
    var a = reader.nextDouble()
    print("Escolha o valor de b: ")
    var b = reader.nextDouble()

    when (opt) {
        1 -> {
            println("SOMA = ${soma(a, b)}")
        }
        2 -> {
            println("SUBTRACAO = ${sub(a, b)}")
        }
        3 -> {
            println("MULTIPLICACAO =  ${mult(a, b)}")
        }
        4 -> {
            println("DIVISAO = ${div(a, b)}")
        }
    }

    println("Final")
}