package br.com.maluzita

fun main() {
    var list = listOf( 0, 2, 4, 6, 8 ) // semelhante a array

    // Duas formas diferentes com o mesmo proposito
    val arrayList = arrayListOf( 1, 2, 3, 4, 5, 6 )
    val mutableList = mutableListOf( 8, 9, 10, 11, 12, 13 )

    println()
    println()
    println("================= TRABALHANDO COM LISTAS ====================")
    println()
    // Mostrando a lista
    println("Mostrando a list: " + list)
    println("Mostrando a arrayList: " + arrayList)
    println("Mostrando a mutableList: " + mutableList)
    println()

    // Funcoes Prontas
    println("Testando funções...")
    println()
    println("Add elementos nas listas:")
    list += listOf(10)
    arrayList.add(8)
    mutableList.add(14)
    println("Mostrando a list adicionada: " + list)
    println("Mostrando a arrayList adicionada: " + arrayList)
    println("Mostrando a mutableList adicionada: " + mutableList)
    println()
    println("Pegando elementos nas listas:")
    println("Qual elemento está no índice 5 na list? " + list.get(5))
    println("Qual elemento está no índice 2 na arrayList? " + arrayList.get(2))
    println("Qual elemento está no índice 0 na mutableList? " + mutableList.get(0))
    println()
    println("Setando valores de índices específicos nas listas:")
    arrayList.set(3, 100)
    mutableList.set(2, 23)
    println("A função set não está disponível para a list.")
    println("Mostrando a arrayList setada: " + arrayList)
    println("Mostrando a mutableList setada: " + mutableList)

}