package br.com.maluzita.poo

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Application {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            println()
            println("=================== BEM-VINDO AO PETSHOP ===================")
            println("Gostaria de se registrar?")
            print("Digite S para sim e N para não: ")
            var resposta = sc.next().single().uppercaseChar()
            sc.nextLine()
            if (resposta.equals('S')){
                val pessoaRegistrada:Pessoa = registrarPessoa()
                println("Seu cadastro foi feito com sucesso!")
                println()
                println("Vamos começar?")
                print("Quantos bichinhos você gostaria de adotar? ")
                var numero = sc.nextInt()
                var nome = ""
                for (i in 1..numero){
                    println("Qual animal você gostaria de adotar?")
                    println("Temos gatinhos, cachorrinhos, pintinhos, maritacas, hamsters, topolinos e betas")
                    print("Digite a letra inicial do bichinho: ")
                    resposta = sc.next().single().lowercaseChar()
                    sc.nextLine()
                    print("Dê um nome a ele: ")
                    nome = sc.nextLine()
                    println()
                    when (resposta){
                        'g' -> pessoaRegistrada.adotar(Gato(nome))
                        'c' -> pessoaRegistrada.adotar(Cachorro(nome))
                        'p' -> pessoaRegistrada.adotar(Ave(nome))
                        'm' -> pessoaRegistrada.adotar(Ave(nome))
                        'h' -> pessoaRegistrada.adotar(Roedor(nome))
                        't' -> pessoaRegistrada.adotar(Roedor(nome))
                        'b' -> pessoaRegistrada.adotar(Peixe(nome))
                    }
                }
                for (animal in pessoaRegistrada.animaisAdotados){
                    println("--------------------------------------------------")
                    animal.comunicar()
                    println()
                    animal.indicacaoDeCompra()
                    println()
                }
            }
            println("--------------------------------------------------")
            println("Avalie nosso atendimento!")
            print("Digite sua nota de 1 a 5: ")
            resposta = sc.next().single()
            println("====================== AVALIAÇÃO ===========================")
            println("Você nos avaliou com " + resposta + " estrelas.")
        }
    }
}

fun registrarPessoa():Pessoa{
    val sc = Scanner(System.`in`)
    var nome = ""
    var cpf = ""
    var auxString = ""
    var data = LocalDate.now()

    print("Digite seu nome: ")
    nome = sc.nextLine()
    print("Digite seu cpf sem pontuações: ")
    cpf = sc.next()
    sc.nextLine()
    print("Digite sua data de nascimento no formato 01/01/1990: ")
    auxString = sc.next()
    sc.nextLine()
    data = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(auxString))

    val novoRegistro = Pessoa(cpf, nome, data)
    println("Sua idade: " + novoRegistro.idade + " anos")

    return novoRegistro
}

