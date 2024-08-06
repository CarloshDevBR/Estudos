package exercicios2

/*
     a. Crie um novo arquivo com uma função main.
     b. Declare uma variável mutável capaz de armazenar seu nome completo.
     c. Declare uma variável de texto sem valor algum.
     d. Declare uma variável imutável com o menor tipo de dado
        possível capaz de armazenar o número que você calça.
     e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
     f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
     g. Imprima o valor do PIB per capita.
     h. Rode seu programa de maneira que não tenha erros de compilação ou execução.
*/

fun main() {
    var nome = "Carlos Henrique Ribeiro da Silva"
    val description: String
    val shoeNumber: Byte = 42
    val pib: Double = 1.869_000_000_000
    val population: Double = 211.000_000

    println(pib / population)
}