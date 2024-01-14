package br.com.maluzita.poo

class Peixe(nome: String) :Animal(nome) {

    override fun comunicar(){
        println("Glub glub!")
    }

    override fun indicacaoDeCompra(){
        println("Para o peixe " + nome + " compre: " )
        println("Um aquário, cascalhos naturais e ração")
        println("Indicamos também as nossas decorações de aquário!")
    }
}