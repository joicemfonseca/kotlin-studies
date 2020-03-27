fun main(){

    println("Digite o ano")
    val ano = readLine()!!.toInt()

    if ( ano % 4 == 0){
        println("Esse é um ano bissexto")
    }else {
        println("Esse não é um ano bissexto")
    }
}