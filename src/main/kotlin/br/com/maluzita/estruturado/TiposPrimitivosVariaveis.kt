package br.com.maluzita.estruturado

import java.math.BigDecimal

class TiposPrimitivosVariaveis {
}

fun main(){
    // val -> variável constante
    // var -> variável "acessível"
    println()
    println()
    println("Variáveis: Tipos Primitivos")
    println()

    // ============================= NUMÉRICOS ==================================
    //Byte (8b), Short (16b), Int (32b) e Long (64b)
    val byte = 127
    val short = 32767
    val int = 2147483647
    val long = 9223372036854775807
    println("Valor máximo da variável byte: " + byte)
    println("Valor máximo da variável short: " + short)
    println("Valor máximo da variável int: " + int)
    println("Valor máximo da variável long: " + long)

    // Float (32b) e Double (64b)
    val float = 1.584239f
    val double = 1.2495276548031004
    println("Número máximo de casas da variável float: " + float)
    println("Número máximo de casas da variável double: " + double)

    // BigDecimal (muito preciso - veio do Java)
    var bigDecimal: BigDecimal = BigDecimal.ZERO
    bigDecimal = BigDecimal(1.58423)
    println("Uma opção mais precisa para lidar com flutuantes - BigDecimal: "
            + bigDecimal)

    // =========================== NÍVEL LÓGICO ================================
    //Boolean
    val boolean = false
    println("Variável de nível lógico - booleana: " + boolean)

    // ============================ CARACTERES =================================
    // Char e String
    val char = 'A'
    val string = "Malu"
    println("Apenas um caracter - char: " + char)
    println("Uma cadeia de caracteres - string: " + string)

    // ============================== VETOR ====================================
    // Array
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    print("Um conjunto de dados do mesmo tipo - array: (")
    print(arrayToString(array))
    println(")")
}

fun arrayToString (array: Array <Int>) = array.fold(""){acc, i -> "$acc $i,"}