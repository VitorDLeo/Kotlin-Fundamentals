fun main() {
    println(max(10, 5))
    println(max1(5, 20))
}

fun max(a:Int, b:Int): Int{
    return if (a > b) a else b
}

fun max1(a: Int, b:Int): Int = if (a > b) a else b