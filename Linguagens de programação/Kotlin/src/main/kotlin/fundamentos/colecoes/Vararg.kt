package fundamentos.colecoes

data class Worker(
     val name: String,
     val salary: Double,
     val job: String
)

fun main() {
    val arr = intArrayOf(6, 7, 8, 9, 10)

    // *arr é um spread operator que irá esparramar os dados como parametro (não é possível passar o array diretamente)
    val res1 = sum(1, 2, 3, 4, 5, *arr)

    val res2 = calcSalary(
        Worker("Carlos", 2800.0, "Programmer"),
        Worker("Andrea", 3200.0, "Dentist"),
        Worker("Ruan", 2500.0, "PO")
    )

    println(res1)
    println(res2)
}

// vararg permite passar uma coleção de dados

fun sum(vararg numbers: Int): Number {
    val reduced = numbers.reduce { acc, i -> acc + i  }

    return reduced
}

fun calcSalary(vararg workers: Worker): Double {
    /*
        Tratando os dados com map para retornar somente o valor de salary,
        e encadeando o método reduce para calcular tudo
    */
    val reducedSalaryInWorkers = workers.map { it.salary }.reduce { acc, salary -> acc + salary }

    return reducedSalaryInWorkers
}