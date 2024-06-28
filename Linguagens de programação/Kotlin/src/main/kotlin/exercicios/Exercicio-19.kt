package exercicios

fun main() {
    val a1 = Account(100.0)

    a1.deposit(50.0)

    val s1 = a1.status()
    println(s1)

    a1.withdraw(100.0)

    val s2 = a1.status()
    println(s2)
}

private class Account(
    var initialBalance: Double = 0.0
) {
    init {
        require(initialBalance > 0.0) { "O valor é negativo" }
    }

    private var balance: Double = initialBalance

    fun deposit(value: Double) {
        require(value > 0.0) { "O valor do deposito é inválido" }

        balance += value
    }

    fun withdraw(value: Double) {
        require(balance > 0.0) { "O saldo da conta é 0" }
        require(balance > value) { "O saldo da conta é insuficiente" }
        require(value > 0.0) { "O valor do saque não pode ser negativo" }

        balance -= value
    }

    fun status(): Double {
        return balance
    }
}