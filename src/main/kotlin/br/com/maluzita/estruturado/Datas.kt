package br.com.maluzita

import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*


fun main() {
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    println()
    println()
    println("MOSTRANDO OS VALORES DAS VARIÁVEIS:")

    // Como parsear de string para data?
    var today = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("12/01/2024"))
    var todayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("12/01/2024 22:05"))
    println("Data Atual: " + today)
    println("Data e horário atual: " + todayTime)

    // Para a var date criada no topo
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
    var yesterday = simpleDateFormat.parse("12/01/2024")
    println("Infos de hoje: " + yesterday)
    println("---------------------------------------------------------------------")

    // Printando uma string formatada
    println("PRINTANDO A DATA FORMATADA:")
    print("Data atual: ")
    println(formatandoData(today)) // Para o Local Date
    print("Data e horário atual: ")
    println(formatandoDataHora(todayTime)) // Para o Local Date Time
    print("Data atual: ")
    println(formatandoDate(yesterday)) // Para o date
    println("---------------------------------------------------------------------")

    // Soma e subtracao de datas
    println("SOMANDO DIAS À DATA:")
    todayTime = todayTime.plusDays(2)
    println("Nova data: " + formatandoDataHora(todayTime))
    println()
    println("SUBTRAINDO DIAS DA DATA:")
    today = today.minusDays(2)
    println("Nova data: " + formatandoData(today))
    yesterday = Date(yesterday.toInstant().minus(1, ChronoUnit.DAYS).toEpochMilli())
    println("Ajustando a data para ontem: " + formatandoDate(yesterday))
    println("---------------------------------------------------------------------")

    // Comparando datas
    println("COMPARANDO DATAS:")
    print(formatandoData(today) + " vem depois de ")
    print(formatandoDataHora(todayTime) + "? ")
    println(today.isAfter(todayTime.toLocalDate()))
    print("E antes? ")
    println(today.isBefore(todayTime.toLocalDate()))
    print(formatandoDataHora(todayTime) + " é igual a ")
    print(formatandoData(today) + "? ")
    println(todayTime.isEqual(today.atStartOfDay()))
    print("Por último, ontem foi dia 11 de Janeiro? " )
    println(yesterday.equals(simpleDateFormat.parse("11/01/2024")))
    println()
    println("COMPARANDO DIAS DA SEMANA:")
    while (todayTime.dayOfWeek == DayOfWeek.SATURDAY || todayTime.dayOfWeek == DayOfWeek.SUNDAY){
        // Pulando os finais de semana
        todayTime = todayTime.plusDays(1)
    }
    println("Pulando o final de semana... " + formatandoDataHora(todayTime))
    println("---------------------------------------------------------------------")
    // Trabalhando com o Callender para a comparacao do date
    val calendar = Calendar.getInstance()
    calendar.time = yesterday
    println("TRABALHANDO COM CALENDAR:")
    while (calendar.get(Calendar.DAY_OF_WEEK) != 6){
        println("Hoje é sexta? false (" + formatandoDate(yesterday) + ")")
        yesterday = Date(yesterday.toInstant().plus(1, ChronoUnit.DAYS).toEpochMilli())
        calendar.time = yesterday
    }
    println("Hoje é sexta! " + formatandoDate(yesterday))
}

fun formatandoData(local:LocalDate):String{
    var data = ""
    data = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(local)

    return data
}

fun formatandoDataHora(dateTime: LocalDateTime):String{
    var dataHora = ""
    dataHora = DateTimeFormatter.ofPattern("dd/MM/yy - HH:mm").format(dateTime)

    return dataHora
}

fun formatandoDate(dataCompleta:Date):String{
    val formatacao = SimpleDateFormat("dd/MM/yyyy - EEE")

    return formatacao.format(dataCompleta)
}