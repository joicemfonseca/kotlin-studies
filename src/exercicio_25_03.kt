fun main() {

    println("Digite uma letra")
    val letra = readLine()!!.toString()

    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
        println("É uma vogal")
    } else {
        println("É uma consoante")
    }
}