package fundamentos.classes

fun main() {
    val a1 = Account(423,"Carlos")
    val a2 = Account(312,"Silva")

    a1.deposit(100.00)
    a2.deposit(1_000_000.0)
    a2.deposit(1000)

    a1.viewStatus()
    a2.viewStatus()
}

// Construtor padrão
class Account(
    // Definido diretamente como atributo
    private val accountNumber: Int,
    private val owner: String
) {
    // Atributo (ou propriedade)
    private var balance: Double = 0.0

    // Método da classe Account
    fun deposit(value: Double) {
        balance += value
    }

    // Sobrecarga de método (o parametro deve ser diferente se nao o compilador nao encontra)
    fun deposit(value: Int) {
        balance += value
    }

    fun viewStatus() {
        println("Number: $accountNumber\nOwner: $owner\nBalance: $balance")
    }
}