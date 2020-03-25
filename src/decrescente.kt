fun main() {
    println("Digite o primeiro numero")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo numero")
    val num2 = readLine()!!.toInt()
    println("Digite o terceiro numero")
    val num3 = readLine()!!.toInt()

    if (num1 >= num2 && num1 >= num3) {
        println(num1)
    } else if (num2 >= num1 && num2 >= num3) {
        println(num2)
    } else if (num3 >= num1 && num3 >= num2) {
        println(num3)
    }

    if (num1 in num2..num3) {
        println(num1)
    } else if (num2 in num1..num3) {
        println(num2)
    } else if (num3 in num1..num2) {
        println(num3)
    }

    if (num1 <= num2 && num1 <= num3) {
        println(num1)
    } else if (num2 <= num1 && num2 <= num3) {
        println(num2)
    } else if (num3 <= num1 && num3 <= num2) {
        println(num3)
    }
}