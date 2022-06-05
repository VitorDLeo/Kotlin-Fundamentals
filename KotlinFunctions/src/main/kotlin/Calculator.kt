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

    println("--------------------------")
    println("Bem Vindo a Caculadora")
    println("Digite a sua opcao")
    println("[ 1 ] Soma")
    println("[ 2 ] Subtracao")
    println("[ 3 ] Multiplicacao")
    println("[ 4 ] Divisao")
    println("--------------------------")
    val opt : Int = reader.nextInt()
    print("Escolha o valor de a: ")
    var a = reader.nextDouble()
    print("Escolha o valor de b: ")
    var b = reader.nextDouble()

    when (opt) {
        1 -> {
            println(soma(a, b))
        }
        2 -> {
            println(sub(a, b))
        }
        3 -> {
            println(mult(a, b))
        }
        4 -> {
            println(div(a, b))
        }
    }
}