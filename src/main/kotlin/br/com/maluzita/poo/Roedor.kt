package br.com.maluzita.poo

class Roedor(nome: String) :Animal(nome) {

    override fun comunicar(){
        println("chiii chiiii!")
    }

    override fun indicacaoDeCompra(){
        println("Para o roedor " + nome + " compre: " )
        println("Uma gaiola, bebedouro, ração e serragem.")
        println("Indicamos também pó de banho e rodinha para corrida.")
    }
}