package exercicios2

/*
    1. Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
    do ano. Os bônus são classificados por cargo.
        a. Gerentes recebem R$ 2.000,00
        b. Coordenadores recebem R$ 1.500,00
        c. Engenheiros de software recebem R$ 1.000,00
        d. Estagiários recebem R$ 500,00

    2. Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
        a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
        b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
        c. Engenheiros de software recebem R$ 1.000,00
        d. Estagiários recebem R$ 500,00
*/

enum class Position(val base: Float, val minPay: Float, val maxPay: Float) {
    MANAGER(2000f, 2000f, 3000f) {
        override fun getpaymentAmount(exp: Float): Float = if (exp < 2) minPay else maxPay
    },
    COORDINATOR(1500f, 1500f, 1800f) {
        override fun getpaymentAmount(exp: Float): Float = if (exp < 1) minPay else maxPay
    },
    ENGINEER(1000f, 1000f, 1000f) {
        override fun getpaymentAmount(exp: Float): Float = base
    },
    INTERN(500f, 500f, 500f) {
        override fun getpaymentAmount(exp: Float): Float = base
    };

    abstract fun getpaymentAmount(exp: Float): Float
}

fun main() {
    val payment1 = Position.MANAGER.getpaymentAmount(2f)
    val payment2 = Position.COORDINATOR.getpaymentAmount(0.8f)
    val payment3 = Position.COORDINATOR.getpaymentAmount(2f)
    val payment4 = Position.ENGINEER.getpaymentAmount(3f)
    val payment5 = Position.INTERN.getpaymentAmount(.6f)

    println("$payment1 \n$payment2 \n$payment3 \n$payment4 \n$payment5")
}








