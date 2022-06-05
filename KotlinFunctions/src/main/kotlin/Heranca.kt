
open class Animal{
    open fun dormir(){
        println("Dormir!")
    }
    fun correr(){
        println("Correr")
    }
}

class Cao : Animal() {
    override fun dormir() {
        super.dormir()
        println("como um cao")
    }
}

class Passaro : Animal() {
    override fun dormir() {
        super.dormir()
        println("como um passaro")
    }
}

fun main() {

    var cao = Cao()
    cao.dormir()
    cao.correr()

    var passaro = Passaro()
    passaro.dormir()
    passaro.correr()
}