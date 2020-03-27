fun main (){
    println("Digite a quantidade de horas")
    val qtdHoras = readLine()!!.toInt()
    println("Digite o valor das horas")
    val valor = readLine()!!.toInt()

    val salarioBruto = qtdHoras * valor

    var porcentagemIR = 0.0
    val porcentagemSin = 3.0
    val porcentagemINSS = 10.0
    val porcentagemFGTS = 11.0

    // IDENTIFICO PORCENTAGEM DE IR
    if (salarioBruto in 901..1500) {
        porcentagemIR = 5.0
    } else if (salarioBruto in 1501..2500) {
        porcentagemIR = 10.0
    } else if (salarioBruto in 2501..Int.MAX_VALUE){
        porcentagemIR = 20.0
    }

    // CALCULO IR
    val valorIR = salarioBruto * (porcentagemIR / 100)
    val valorSindicato = salarioBruto * (porcentagemSin / 100)
    val valorFGTS = salarioBruto * (porcentagemFGTS / 100)
    val valorINSS = salarioBruto * (porcentagemINSS / 100)

    val totalDescontos = valorIR + valorSindicato + valorINSS
    val salarioLiquido = salarioBruto - totalDescontos

    println("Salário bruto ($qtdHoras * $valor)   :  R$$salarioBruto")
    println("(-) IR (${porcentagemIR.toInt()}%)             :  R$$valorIR")
    println("(-) INSS (${porcentagemINSS.toInt()}%)         :  R$$valorINSS")
    println("(-) Sindicato (${porcentagemSin.toInt()}%)     :  R$$valorSindicato")
    println(" FGTS (${porcentagemFGTS.toInt()}%)            :  R$$valorFGTS")
    println(" Total de descontos                     R$$totalDescontos")
    println(" Salário líquido                        R$$salarioLiquido")
}