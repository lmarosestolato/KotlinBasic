package br.com.maluzita.poo

import java.time.LocalDate

class Pessoa ( // construtor
    val cpf:String,
    val nome:String,
    val dtNasc:LocalDate
) {
    val idade = LocalDate.now().year - dtNasc.year

    fun comentar(msg:String){
        println(nome + " comentou: " + msg)
    }

    val animaisAdotados = mutableListOf<Animal>()

    fun adotar(animal: Animal){
        animaisAdotados.add(animal)
    }
}