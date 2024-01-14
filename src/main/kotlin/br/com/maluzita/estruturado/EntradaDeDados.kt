package br.com.maluzita.estruturado

import java.math.BigDecimal
import java.util.*

fun main() {
    Locale.setDefault(Locale.US) // Seta os dados para o padrao estadunidense
    val sc = Scanner(System.`in`) // Permite a entrada de dados pelo console

    var char = 'c'
    var string1 = ""
    var string2 = ""
    var int = 0
    var float = 0.0f
    var double = 0.0
    var big:BigDecimal = BigDecimal.ZERO
    var bool = false
    var array: Array<Int?> = arrayOfNulls<Int>(5) // Cria uma array de 5 posições preenchidas com nulo

    println()
    println()
    print("Entre com um caracter: ")
    char = sc.next().single()
    print("Entre com um texto sem espaços: ")
    string1 = sc.next()
    sc.nextLine()
    print("Entre com um texto com espaços: ")
    string2 = sc.nextLine()
    print("Entre com um inteiro: ")
    int = sc.nextInt()
    print("Entre com um float: ")
    float = sc.nextFloat()
    print("Entre com um double: ")
    double = sc.nextDouble()
    print("Entre com um big decimal: ")
    big = sc.nextBigDecimal()
    print("Entre com um booleano: ")
    bool = sc.nextBoolean()
    for (i in 0..4){
        var dado:Int = 0
        print("Entre com um inteiro para array: ")
        dado = sc.nextInt()
        array[i] = dado
    }

    println()
    println("================= DADOS FORNECIDOS ===================")
    println("Caracter: " + char)
    println("String 1: " + string1)
    println("String 2: " + string2)
    println("Int: " + int)
    println("Float: " + float)
    println("Double: " + double)
    println("BigDecimal: " + big)
    println("Boolean: " + bool)
    print("Array: ( ")
    for (dado in array){
        print(dado.toString() + " ")
    }
    println(")")
}