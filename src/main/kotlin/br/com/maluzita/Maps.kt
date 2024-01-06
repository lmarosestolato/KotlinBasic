package br.com.maluzita

import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    // Sistema de conjunto de dados chave-valor
    val map1 = mapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoavel",
        4 to "Bom",
        5 to "Muito Bom"
    )
    val map2 = mutableMapOf( // eh dinamico (facil de inserir dados)
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoavel",
        4 to "Bom"
    )
    map2[5] = "Muito Bom"

    // Lista com as possibilidades de valores
    val lista = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Razoavel"),
        Pair(4, "Bom"),
        Pair(5, "Muito Bom")
    )

    println()
    println()
    println("======================== PERFORMANCE ==========================")
    // Criando 100 mil codigos aleatorios de 1 a 5 ( [1, 6[ )
    val listaCod = Array(100000){ Random.nextInt(1, 6) }

    println("Tempo da lista: " + performanceLista(listaCod, lista) + "[ns]")
    println("Tempo do map: " + performanceMap(listaCod, map1) + "[ns]")
    println()

    println("====================== MOSTRANDO DADOS ========================")
    println("Dados do Map1: ")
    mostrarDadosChaveValor(map1)
    println()
    println("Dados do Map2: ")
    mostrarDadosChaveValor(map2)
    println()
    println("Dados da Lista:")
    mostrarDadosPares(lista)
    println()

}

fun mostrarDadosChaveValor(map:Map<Int, String>){
    for(dado in map.keys){
        println("Chave: " + dado + " -> Valor: " + map.get(dado))
    }
}

fun mostrarDadosPares(lista: List<Pair<Int, String>>){
    var chave:String = ""
    var valor:String = ""
    for(dado in lista.indices){
        val string = lista.get(dado).toString().split(", ")
        chave = string.get(0).drop(1)
        valor = string.get(1).dropLast(1)
        println("Chave: " + chave + " -> Valor: " + valor)
    }
}

fun performanceLista(
    array: Array<Int>,
    lista: List<Pair<Int, String>>
):Long{
    val time = measureNanoTime {
        for (codigo in array) {
            val categoria = lista.find { it.first == codigo } !!
        }
    }
    return time
}

fun performanceMap(
    array: Array<Int>,
    map:Map<Int, String>
):Long{
    val time = measureNanoTime {
        for (codigo in array) {
            val categoria = map[codigo]
        }
    }
    return time
}