package fundamentos.exceptions

fun main() {
    val account = BankAccount()

    // Tratando as fundamentos.exceptions
    /*
         Pode ter quantos blocos catch quiser,
         e cada tipo de retorno do catch influencia diretamente em qual catch ele vai cair
    */
    /*
        Sempre faça catch de fundamentos.exceptions, nunca de error,
        porquê a JVM não deve continuar rodando caso acontecar um error
    */
    try {
        account.deposit(100.0)
        account.withdraw(125.0)
    } catch (err: InvalidDepositValueException) {
        println("Ops, invalid deposit: ${err.message}")
    } catch (err: InvalidWithDrawValueException) {
        println("Error! Current balance is ${err.message}")
    } finally {
        // No finally sempre será executado
        println(account.balance)
    }
}

class BankAccount {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        // Lançando uma exception
        if (value < 0) throw InvalidDepositValueException(value)

        balance += value
    }

    fun withdraw(value: Double) {
        // Lançando uma exception
        if (value < 0) throw InvalidDepositValueException(value)
        if (value > balance) throw InvalidWithDrawValueException(balance)

        balance -= value
    }
}
