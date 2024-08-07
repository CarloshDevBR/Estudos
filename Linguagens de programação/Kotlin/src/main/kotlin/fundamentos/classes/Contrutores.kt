package fundamentos.classes

fun main() {
    Owner("Carlos", "Henrique")
    Pet("Cat")
    val account = AccountBank("Carlos", 4123, 10000.0)

    println(account.status())
}

// Classe com constructor primário
private class Owner constructor(firstName: String, lastName: String) {
    init {
        println(firstName)
    }
}

// Classe com constructor primário omitido
private class Dog(firstName: String)

//Classe com construtor secundário
private class Pet {
    constructor(pet: String) {
        println(pet)
    }
}

// Criando vários construtores
private class AccountBank(
    // Definido diretamente como atributo
    val accountName: String,
    val accountNumber: Int
) {
    var balance: Double = 0.00

    // Constructor secundário (será chamado caso o primário não existir valor)
    constructor() : this("Sem nome", 0) {
        println("constructor foi chamado")
    }

    // Construtor secundário não pode ter a mesma quantidade de parametros que o primário
    constructor(accountName: String, accountNumber: Int, balance: Double = 100.00) : this(accountName, accountNumber) {
        this.balance = balance
    }

    fun status() {
        println("Name: $accountName\nNumber: $accountNumber\nBalance: $balance")
    }
}