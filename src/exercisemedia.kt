fun main() {
    println("Digite a primera nota")
    val nota1 = readLine()!!.toInt()
    println("Digite a segunda nota")
    val nota2 = readLine()!!.toInt()

    val media = ( nota1 + nota2 ) / 2
    println("Sua média é $media")

    if (media >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
}