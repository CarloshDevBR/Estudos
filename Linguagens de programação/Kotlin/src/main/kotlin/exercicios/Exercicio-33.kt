package exercicios

fun main() {
    // ---------------------------------------------------------------------------------------------------------------//
    People.data().filter { a -> a.age >= 10 }.forEachIndexed { index, animal -> println("${index + 1} - ${animal.name}") }

    // ---------------------------------------------------------------------------------------------------------------//
    People.data().map { it.age }.sorted().forEach { println(it) }

    // ---------------------------------------------------------------------------------------------------------------//
    // distinct remove valores duplicados
    People.data().map { it.age }.distinct().sortedBy { it }.forEach { println(it) }

    // ---------------------------------------------------------------------------------------------------------------//
    // shuffled vai embaralhar a lista, e o take irá pegar os primeiros 3 elementos da lista
    People.data().map { it.name }.shuffled().take(3).forEach { println(it) }

    // ---------------------------------------------------------------------------------------------------------------//
    // count retorna a quantidade da lista (passando uma lambda com uma verificação consegue filtrar, e depois retorna a quantidade)
    val count = People.data().count { it.name.lowercase().startsWith("r") }

    println(count)

    // ---------------------------------------------------------------------------------------------------------------//
    // sumOf irá somar tudo (específica para objetos)
    val sumTotalAge = People.data().filter { it.name.lowercase().startsWith("r") }.sumOf { it.age }

    println(sumTotalAge)

    // ---------------------------------------------------------------------------------------------------------------//
    // reduce é util para somar
    val sumTotalAgeReduce = People.data().map{ it.age }.reduce { acc, age -> acc + age }

    println(sumTotalAgeReduce)

    // ---------------------------------------------------------------------------------------------------------------//
    // minOf e maxBy retornam o elemento máximo ou mínimo da coleção
    val maxName = People.data().map { it.name }.maxBy { it.length }
    val minAge = People.data().minOf { it.age }

    println(maxName)
    println(minAge)

    // ---------------------------------------------------------------------------------------------------------------//
    // find procura o elemento e retorna ele ou null
    val age = People.data().find { it.name == "Carlos" }?.age?:0

    // ---------------------------------------------------------------------------------------------------------------//
    // se o first não encontrar o elemento retorna NoSuchElementException
    val age2 = People.data().first { it.name == "Carlos" }.age

    println("$age - $age2")

    // ---------------------------------------------------------------------------------------------------------------//
    // any verifica se existe na coleção
    val isAny = People.data().any { it.age == 20 }

    // all retorna true se todos satisfazerem
    val isAll = People.data().all { it.age == 20 }

    // none retorna true se nenhum satisfazer
    val isNone = People.data().none { it.age == 20 }

    println("$isAny - $isAll - $isNone")

    // ---------------------------------------------------------------------------------------------------------------//
    // joinToString junta os elementos da coleção
    val string = People.data().joinToString(" - ", "(", ")" ) { it.name }

    println(string)

    // ---------------------------------------------------------------------------------------------------------------//
    // associate irá transformar a coleção em um map
    People.data().associate { it.name to it.age }.forEach { (n, a) -> println("$n => $a") }

    // associateBy irá transformar em map com a chave que definir (o valor sempre será o próprio objeto)
    People.data().associateBy { it.name }.forEach { (_, p) -> println("${p.name} - ${p.age}") }

    // ---------------------------------------------------------------------------------------------------------------//
    // groupBy irá agrupar em um map
    People.data().groupBy({ it.name[0] }, { it.name }).toSortedMap().forEach { (k, v) -> println("$k -> $v") }

    // groupingBy retornará um Grouping e eachCount irá contar cada agrupamento
    People.data().groupingBy { it.name[0] }.eachCount().forEach { (k, v) -> println("$k => $v") }

    // ---------------------------------------------------------------------------------------------------------------//
    // o avarege calcula a média dos dados
    println(People.data().map { it.age }.average())
}

data class People(val name: String, val age: Int) {
    companion object {
        fun data(): List<People> {
            return listOf(
                People("João", 21),
                People("Fernando", 46),
                People("Carlos", 22),
                People("Maria", 22),
                People("Alisson", 50),
                People("Rayssa", 18),
                People("Rayane", 19)
            )
        }
    }
}