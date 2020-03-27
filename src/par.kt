fun main(){
    println("Digite um número")
    val num = readLine()!!.toInt()

    if (num % 2 == 0){
        println("É um número par")

    }else {
        println("É um número ímpar")
    }
}