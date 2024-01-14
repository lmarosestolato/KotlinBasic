package br.com.maluzita.poo

class Ave(nome: String) : Animal(nome) {

    override fun comunicar(){
        println("Piu-piu!")
    }

    override fun indicacaoDeCompra(){
        println("Para a ave " + nome + " compre: " )
        println("Uma gaiola, ração, bebedouro e comedouro.")
        println("Indicamos também a semente de girassol ou quirera de milho, conforme a espécie.")
    }
}