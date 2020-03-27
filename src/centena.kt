fun main(){

    println("Digite um número")
    val num = readLine()!!.toInt()
    val string = num.toString()

    if (string[string.length - 1] != ' ') {
        println(string[string.length - 1] + " unidades")
    }

    if (string[string.length - 2] != ' ') {
        println(string[string.length - 2] + " dezenas")
    }

}