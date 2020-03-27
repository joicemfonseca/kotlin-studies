fun main(){
    println("Quantos litros voce colocou?")
    val litro = readLine()!!.toInt()
    println("Qual combustível você colocou?")
    val combustivel = readLine()!!
    val gasolina = "G"
    val etanol = "E"
    var precoSemDesconto: Double
    var precoComDesconto: Double = 0.0

    if ( combustivel == etanol ){
        precoSemDesconto = litro * 1.90
        if (litro > 20) {
            precoComDesconto = precoSemDesconto - (precoSemDesconto * (5.toDouble() / 100))
        } else {
            precoComDesconto = precoSemDesconto - (precoSemDesconto * (3.toDouble() / 100))
        }
    } else if ( combustivel == gasolina){
        precoSemDesconto = litro * 2.50
        if (litro > 20){
            precoComDesconto = precoSemDesconto - (precoSemDesconto * (6.toDouble() / 100))
        }else {
            precoComDesconto = precoSemDesconto - (precoSemDesconto * (4.toDouble() / 100))
        }
    }

    println("O valor a pagar é $precoComDesconto reais")
}
