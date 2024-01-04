package br.com.maluzita

import java.math.BigDecimal

fun main() {
    var car1 = arrayOf( BigDecimal(1.99), BigDecimal(23.35), BigDecimal(7.80),
        BigDecimal(2.10), BigDecimal(2.10), BigDecimal(2.10),
        BigDecimal(9.99) )
    var car2 = arrayOf( BigDecimal(13.80), BigDecimal(7.98), BigDecimal(6.99),
        BigDecimal(3.45), BigDecimal(1.99), BigDecimal(1.99),
        BigDecimal(24.33) )
    var car3 = arrayOf( BigDecimal(21.34), BigDecimal(3.49), BigDecimal(3.49),
        BigDecimal(8.98), BigDecimal(2.39), BigDecimal(3.10),
        BigDecimal(14.99) )

    println()
    println()
    println("Valores do primeiro carrinho:")
    mostrarArray(car1)
    var totalCompra: BigDecimal = somarProdutos(car1)
    println("Total da compra: R$" + totalCompra.setScale(2, BigDecimal.ROUND_HALF_UP))
    println("-----------------------------------------------------------------")
    println("Valores do segundo carrinho:")
    mostrarArray(car2)
    totalCompra = somarProdutos(car2)
    println("Total da compra: R$" + totalCompra.setScale(2, BigDecimal.ROUND_HALF_UP))
    println("-----------------------------------------------------------------")
    println("Valores do terceiro carrinho:")
    mostrarArray(car3)
    totalCompra = somarProdutos(car3)
    println("Total da compra: R$" + totalCompra.setScale(2, BigDecimal.ROUND_HALF_UP))
}

fun mostrarArray(carrinho: Array<BigDecimal>): Unit{
    print("(")
    var i: Int
    for (i in carrinho.indices){
        if (i == carrinho.size - 1)
            print(carrinho[i].setScale(2, BigDecimal.ROUND_HALF_UP).toString())
        else
            print(carrinho[i].setScale(2, BigDecimal.ROUND_HALF_UP).toString() + ", ")
    }
    println(")")
}

fun somarProdutos(produtos: Array<BigDecimal>):BigDecimal{
    var total: BigDecimal = BigDecimal.ZERO
    for (preco in produtos){
        total += preco
    }
    return total
}