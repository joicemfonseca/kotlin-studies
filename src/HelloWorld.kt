fun main() {
    println("Digite o numero 1")
    val num1 = readLine()!!.toInt()
    println("Digite o numero 2")
    val num2 = readLine()!!.toInt()
    println("Digite o numero 3")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("Numero 1 é o maior")
    } else if (num2 > num1 && num2 > num3) {
        println("Numero 2 é o maior")
    } else if (num3 > num1 && num3 > num2) {
        println("Numero 3 é o maior")
    }

}