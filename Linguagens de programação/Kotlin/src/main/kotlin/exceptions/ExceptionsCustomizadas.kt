package exceptions

// Criando a classes de exception customizada

class InvalidDepositValueException(val value: Double) :  RuntimeException() {
    override val message = "Value $value is not valid"
}

class InvalidWithDrawValueException(val value: Double) : RuntimeException() {
    override val message = "It is not allowed to withdraw more than the current balance: $value"
}