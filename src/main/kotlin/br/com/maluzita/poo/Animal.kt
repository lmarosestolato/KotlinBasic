package br.com.maluzita.poo

open class Animal(var nome:String){

    open fun comunicar(){
        println("É um animal")
    }

    open fun indicacaoDeCompra(){
        println("Compre comida para seu PET!")
    }
}