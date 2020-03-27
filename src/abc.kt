fun main() {

    println("Digite sua nota")
    val nota1 = readLine()!!.toInt()
    println("Digite sua segunda nota")
    val nota2 = readLine()!!.toInt()
    val media: Double = ((nota1 + nota2) / 2).toDouble()
    println("Suas notas foram $nota1 e $nota2")
    println("Sua média foi $media")
    val conceito: String

    if (media in 9.0..10.0) {
        conceito = "A"
    } else if (media in 7.5..8.9) {
        conceito = "B"
    } else if (media in 6.0..7.4) {
        conceito = "C"
    } else if (media in 4.0..5.9) {
        conceito = "D"
    } else {
        conceito = "E"
    }

//    when (media) {
//        in 9.0..10.00 -> conceito = "A"
//        in 7.5..8.9 -> conceito = "B"
//        in 6.0..7.4 -> conceito = "C"
//        in 4.0..5.9 -> conceito = "D"
//    }

    println("Seu conceito foi $conceito")
//    if (conceito == "A" || conceito == "B" || conceito == "C"){
    if (conceito in "A".."C") {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

}