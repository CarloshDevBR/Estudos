package fundamentos.exceptions

// Criando a fundamentos.classes de exception customizada

class InvalidDepositValueException(private val value: Double) :  RuntimeException() {
    override val message = "Value $value is not valid"
}

class InvalidWithDrawValueException(private val value: Double) : RuntimeException() {
    override val message = "It is not allowed to withdraw more than the current balance: $value"
}