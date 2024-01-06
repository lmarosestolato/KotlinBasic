package br.com.maluzita

import java.util.HashSet
import kotlin.concurrent.timer
import kotlin.system.measureNanoTime

fun main() {
    // O Set nao permite a duplicidade de elementos
    val hashSet = hashSetOf( 1, 2, 3, 4 )
    val sortedSet = sortedSetOf( 1, 2, 3, 4 )
    val linkedSet = linkedSetOf( 1, 2, 3, 4 )

    println()
    println()
    println("================ SITUAÇÃO INICIAL ==================")
    print("hashSet: ")
    printAllElements(hashSet)
    print("sortedSet: ")
    printAllElements(sortedSet)
    print("linkedSet: ")
    printAllElements(linkedSet)
    println()
    println("ADICIONANDO ELEMENTOS DISTINTOS (n° 5)...")
    hashSet.add(5)
    sortedSet.add(5)
    linkedSet.add(5)
    print("hashSet: ")
    printAllElements(hashSet)
    print("sortedSet: ")
    printAllElements(sortedSet)
    print("linkedSet: ")
    printAllElements(linkedSet)
    println()
    println("ADICIONANDO ELEMENTOS EXISTENTES (n° 3)...")
    hashSet.add(3)
    sortedSet.add(3)
    linkedSet.add(3)
    print("hashSet: ")
    printAllElements(hashSet)
    print("sortedSet: ")
    printAllElements(sortedSet)
    print("linkedSet: ")
    printAllElements(linkedSet)
    println()
    println("================ COMPORTAMENTO INDIVIDUAL ==================")
    val hashSet2 = hashSetOf( "Maria", "Luiza", "Roses", "Araujo" )
    val sortedSet2 = sortedSetOf( "Maria", "Luiza", "Roses", "Araujo" )
    val linkedSet2 = linkedSetOf( "Maria", "Luiza", "Roses", "Araujo" )
    println()
    println("HashSet:")
    iterarEMostrar(hashSet2)
    println("-----------------------------")
    println("SortedSet:")
    iterarEMostrar(sortedSet2)
    println("-----------------------------")
    println("LinkedSet:")
    iterarEMostrar(linkedSet2)
    println()
    println("===================== PERFORMANCE =======================")
    val hashSet3 = hashSetOf<Int>()
    val sortedSet3 = sortedSetOf<Int>()
    val linkedSet3 = linkedSetOf<Int>()
    println("Tempo em nanosegundos do hashSet: " + calcularTempo(hashSet3) + "[ns]")
    println("Tempo em nanosegundos do sortedSet: " + calcularTempo(sortedSet3) + "[ns]")
    println("Tempo em nanosegundos do linkedSet: " + calcularTempo(linkedSet3) + "[ns]")
}

fun printAllElements(set: Set<Int>){
    println(set.joinToString(", "))
}

fun iterarEMostrar(set: Set<String>){
    var i:Int = 0
    for (i in set.indices){
        println("índice [" + i + "]: " + set.elementAt(i))
    }
}

fun calcularTempo(set: Set<Int>):Long{
    val timeSets = measureNanoTime {
        for(i in 0..10000){
            set.map { i }
        }
    }
    return timeSets
}
