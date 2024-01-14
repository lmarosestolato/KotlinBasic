package br.com.maluzita.poo

class Gato(nome: String) :Animal(nome) {

    override fun comunicar(){
        println("Miau!")
    }

    override fun indicacaoDeCompra(){
        println("Para o gato " + nome + " compre: " )
        println("Ração, areia, caixa de areia, pázinha, comedouro e bebedouro.")
        println("Indicamos também que leve sashês, uma coleira e brinquedos.")
    }
}