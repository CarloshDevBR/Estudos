package fundamentos.classes

fun main() {
    val a1 = Account(423, "Carlos")
    val a2 = Account(312, "Silva")

    // with cria blocos de chamadas para a classe instanciada
    with(a1) {
        this.deposit(100.00)
        this.viewStatus()
    }

    with(a2) {
        this.deposit(1_000_000.0)
        this.deposit(1000)
        this.viewStatus()
    }
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