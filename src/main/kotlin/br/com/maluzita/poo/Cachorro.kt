package br.com.maluzita.poo

class Cachorro(nome: String) :Animal(nome) {

    override fun comunicar(){
        println("Au au!")
    }

    override fun indicacaoDeCompra(){
        println("Para o cachorro " + nome + " compre: " )
        println("Tapete higiênico, ração, comedouro e bebedouro.")
        println("Indicamos também uma coleira e mordedores.")
    }
}