fun main() {
    println("Digite seu salário")
    val salario = readLine()!!.toInt()
    var porcentagem = 0.0

    if (salario in 901..1500) {
        porcentagem = 5.0
    } else if (salario in 1501..2500) {
        porcentagem = 10.0
    } else if (salario in 2501..Int.MAX_VALUE){
        porcentagem = 20.0
    }

    val valorAu = salario * (porcentagem.toDouble() / 100)
    val novoSalari = salario + valorAu
    println("O salario antes do reajuste era $salario reais")
    println("O percentual aplicado foi de $porcentagem %")
    println("O valor de aumento foi $valorAu reais")
    println("O valor do seu salário atual é $novoSalari reais")
}