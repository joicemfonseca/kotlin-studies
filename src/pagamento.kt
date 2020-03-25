fun main() {
    println("Digite seu salário")
    val salario = readLine()!!.toInt()
    var porcentagem: Int

    if (salario <= 280) {
        porcentagem = 20
    } else if (salario in 280..700) {
        porcentagem = 15
    } else if (salario in 700..1500) {
        porcentagem = 10
    } else {
        porcentagem = 5
    }

    val valorAu = salario * (porcentagem.toDouble() / 100)
    val novoSalari = salario + valorAu
    println("O salario antes do reajuste era $salario reais")
    println("O percentual aplicado foi de $porcentagem %")
    println("O valor de aumento foi $valorAu reais")
    println("O valor do seu salário atual é $novoSalari reais")
}