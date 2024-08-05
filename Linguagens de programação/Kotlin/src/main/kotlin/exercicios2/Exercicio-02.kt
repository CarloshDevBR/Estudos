package exercicios2

/*
    1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
    minutos e segundos. Saída desejada:
        2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos

    2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.

    3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).

    4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).

    5. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
        a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
        b. Escrever uma função para a troca de letras e impressão do valor final.
        c. String final deve estar com todas as letras minúsculas.

    6. Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
    sim, transforme-as.
*/

fun main() {
    val res = transformDate(2)

    println(res)

    val countChar = countChar("Teste")

    println(countChar)

    val calcCub = calcCub(3)

    println(calcCub)

    val convert = convertMile(100f)

    println(convert)

    val sanitize = sanitizeString("Teste a")

    println(sanitize)
}

fun transformDate(year: Int): String {
    val totalYear: Byte = 12
    val totalDays: Short = 365
    val totalHours: Short = 8760
    val totalMinutes = 525600
    val totalSeconds = 31536000

    return """"
        $year equivalem a:
        ${year * totalYear} meses
        ${year * totalDays} dias
        ${year * totalHours} horas
        ${year * totalMinutes} minutos
        ${year * totalSeconds} segundos
    """
}

fun countChar(str: String): Int = str.length

fun calcCub(n: Int): Int = n*n*n

fun convertMile(n: Float): String = "total em milhas: ${n * 1.6f}"

fun sanitizeString(str: String): String = str.lowercase().replace("a", "x")
