package br.com.maluzita

import java.math.BigDecimal

fun main() {
    // Criando as variáveis - Tipos Primitivos
    var byte:Byte = 0
    var short:Short = 0
    var int:Int = 0
    var long:Long = 0
    var float:Float = 0.0f
    var double:Double = 0.0
    var big: BigDecimal = BigDecimal.ZERO
    var bool:Boolean = false
    var char:Char = 'A'
    var string:String = "Hello World!"
    var array:Array<Int> = arrayOf( 4, 3, 1, 5, 2 )

    // Mostrando valores iniciais
    println()
    println()
    println("TESTANDO FUNÇÕES...")
    println()
    println("================== Valores Iniciais =====================")
    println("Byte: " + byte)
    println("Short: " + short)
    println("Int: " + int)
    println("Long: " + long)
    println("Float: " + float)
    println("Double: " + double)
    println("BigDecimal: " + big)
    println("Boolean: " + bool)
    println("Char: " + char)
    println("String: " + string)
    print("Array: " )
    mostrarArray(array)

    // Testando funções
    println()
    println("==================== Para Strings =======================")
    println("Quantidade de caracteres: " + string.count())
    println("Separando por parâmetro: " + string.split(" "))
    println("Removendo os últimos caracteres: " + string.dropLast(4))
    println("Removendo os primeiros caracteres: " + string.drop(3))
    println("Tem a letra 'o'? " + string.contains('o'))
    println("E a letra 'm'? " + string.contains('m'))
    println()
    println("==================== Para Arrays =======================")
    println("Somando todos os elementos: " + array.sumOf { it })
    print("Espelhando os elementos: ")
    mostrarArray(array.reversedArray())
    print("Ordenando os elementos - crescente: ")
    mostrarArray(array.sortedArray())
    print("Ordenando os elementos - decrescente: ")
    mostrarArray(array.sortedArrayDescending())
}

fun mostrarArray(array: Array<Int>): Unit{
    print("(")
    var i: Int
    for (i in array.indices){
        if (i == array.size - 1)
            print(array[i].toString())
        else
            print(array[i].toString() + ", ")
    }
    println(")")
}