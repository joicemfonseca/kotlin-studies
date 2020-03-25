fun main() {
    println("Em qual período você estuda?")
    val valor = readLine()!!.toString()

    val matutino = valor == "M"
    val vespertino = valor == "V"
    val noturno = valor == "N"

    if (matutino) {
        println("Bom dia")
    } else if (vespertino) {
        println("Boa tarde")

    } else if (noturno) {
        println("Boa noite")
    } else {
        println("Valor inválido")
    }

    println("Nova versão")
}
