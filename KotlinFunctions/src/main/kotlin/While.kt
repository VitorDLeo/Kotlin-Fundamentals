
fun main() {
    var temp : Int = 0
    var somatorio : Int = 0
    var quantidade : Int = 0

    while (temp != 999){
        println("Digite uma temperatura ou 999 para sair")
        temp = readLine()!!.toInt()

        if (temp != 999){
            somatorio += temp
            quantidade++
        }
    }

    println("A media das temperaturas e = ${somatorio / quantidade}")
}