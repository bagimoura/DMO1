fun main(){
    mensagem("Gabi")

    println(soma(3, 3))
    println(soma(9, 5))

    println("Média: ${media(10, 6, 8)}")
    val notas = doubleArrayOf(10, 10, 2)
    println("Segunda Média: ${media(*notas)}")

    val nome = "Gabriela"
    println("Tamanho: ${nome.tamanho()}")
    println("Dobro de 8: ${8.dobro()}")

    //coleção list
    val lista = listOf(40, 50, 60)
    for(i in lista){
        println(i)
    }

    //coleção set
    val set1 = setOf(40, 50, 60, 40)
    for(i in set1){
        println(i)
    }

    //coleção map
    val map1 = mapOf{
        10 to Gabriela
        20 to Ana Laura
    }

    for(i in map1.entries){
        println("${i.key} -> ${i.value}")
    }

    for((chave, valor) in map1){
        println("${chave} -> ${valor}")
    }
}

//função sem retorno
fun mensagem(nome: String){
    println("Aprendendo funções em Kotlin")
    println("$nome está adorando Kotlin!")
}

//função com retorno
fun soma(num1: Int, num2: Int): Int{
    return num1 + num2
}

//função de uma linha
fun soma2(num1: Int, num2: Int) = (num1 + num2)

//função com quantidade variável de argumentos
fun media(vararg notas: Double): Double{
    var contador = 0
    var somatoria: Double = 0.0

    for(nota in notas){
        contador++
        somatoria += nota
    }

    return somatoria / contador
}

//funções de extensão
fun String.tamanho(): Int{
    return this.length
}

fun Int.dobro(): Int{
    return this * 2
}

//coleção list
fun lista(): List<Int>{
    val lista = listOf(40, 50, 60)
    for(i in lista){
        println(i)
    }

    return lista
}


//coleção set


//coleção map